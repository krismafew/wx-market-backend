package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.service.MarketTopicService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 21:29
 */
@RestController
@RequestMapping("wx/topic/")
public class WxTopicController {
    @Autowired
    private MarketTopicService topicService;
    @GetMapping("list")
    public Object list(){
        return ResponseUtil.ok(topicService.list());
    }

    @GetMapping("detail")
    public Object detail(@RequestParam("id") @Min(value = 1, message = "id must be a positive integer") Integer id){
        Object data = topicService.selectDetailTopic(id);
        if(data == null)
            return ResponseUtil.badArgumentValue();
        return ResponseUtil.ok(data);
    }

    @GetMapping("related")
    public Object related(@RequestParam("id") @Min(value = 1, message = "id must be a positive integer") Integer id){
        return ResponseUtil.okList(topicService.selectRelatedTopics(id));
    }
}
