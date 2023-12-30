package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketComment;
import com.laoyancheng.www.wxmarketbackend.db.dto.CommentDTO;
import com.laoyancheng.www.wxmarketbackend.service.MarketCommentService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 22:57
 */
@RestController
@RequestMapping("wx/comment/")
public class WxCommentController {
    @Autowired
    private MarketCommentService commentService;
    @Autowired
    private SecurityManager securityManager;

    @GetMapping("list")
    public Object list(@RequestParam("valueId") @Min(value = 1, message = "id must be a positive integer") Integer valueId,
                       @RequestParam("type") @Min(value = 0, message = "type must be 0 or 1") Byte type,
                       @RequestParam("limit") @Min(value = 1, message = "limit must be a positive integer") Integer limit,
                       @RequestParam("page") @Min(value = 1, message = "page must be a positive integer") Integer page,
                       @RequestParam("showType") @Min(value = 0) Byte showType) {
        return ResponseUtil.okList(commentService.listComments(valueId, type, limit, page, showType));
    }


    @GetMapping("count")
    public Object count(@RequestParam("valueId") @Min(value = 1, message = "id must be a positive integer") Integer valueId,
                        @RequestParam("type") @Min(value = 0, message = "type must be 0 or 1") Byte type) {
        return ResponseUtil.ok(commentService.count(valueId, type));
    }

    @PostMapping("post")
    public Object post(@RequestBody @Valid CommentDTO commentDTO) {
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        MarketComment comment = commentService.post(userId, commentDTO.getContent(), commentDTO.isHasPicture(), commentDTO.getPicUrls(), commentDTO.getStar(),
                commentDTO.getType(), commentDTO.getValueId());
        if (comment == null)
            return ResponseUtil.badArgumentValue();
        return ResponseUtil.ok(comment);
    }
}
