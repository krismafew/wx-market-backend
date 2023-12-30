package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCollect;
import com.laoyancheng.www.wxmarketbackend.db.dto.CollectDTO;
import com.laoyancheng.www.wxmarketbackend.service.MarketCollectService;
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
 * @Date: 2023/12/30 15:20
 */
@RestController
@RequestMapping("wx/collect/")
public class WxCollectController {
    @Autowired
    private MarketCollectService collectService;
    @Autowired
    private SecurityManager securityManager;
    @GetMapping("list")
    public Object list(@RequestParam("type") @Min(value = 0, message = "type must be 0 or 1") Byte type,
                       @RequestParam("page") @Min(value = 1, message = "page must be a positive integer") Integer page,
                       @RequestParam("limit") @Min(value = 1, message = "limit must be a positive integer") Integer limit){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        return ResponseUtil.okList(collectService.list(userId, type, page, limit));
    }

    @PostMapping("addordelete")
    public Object addordelete(@RequestBody @Valid CollectDTO collectDTO){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        collectService.addordelete(userId, collectDTO.getType(), collectDTO.getValueId());
        return ResponseUtil.ok();
    }
}
