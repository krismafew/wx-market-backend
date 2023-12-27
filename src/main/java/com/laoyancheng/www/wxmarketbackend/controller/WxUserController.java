package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.service.MarketOrderService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/27 21:36
 */
@RestController
@RequestMapping("wx/user")
public class WxUserController {
    @Autowired
    private MarketOrderService orderService;
    @GetMapping("index")
    public Object index(){
        // 获取用户名
        String principal = (String)SecurityUtils.getSubject().getPrincipal();
        // 根据通过OrderService联表查询用户名查询各个state的订单数量
        Map<String, Integer> order = orderService.countOrdersByUsername(principal);
        HashMap<String, Object> data = new HashMap<>();
        data.put("order", order);

        return ResponseUtil.ok(data);
    }
}
