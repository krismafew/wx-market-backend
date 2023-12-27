package com.laoyancheng.www.wxmarketbackend.controller;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketUser;
import com.laoyancheng.www.wxmarketbackend.db.dto.PhoneNum;
import com.laoyancheng.www.wxmarketbackend.db.dto.UserRegisterDTO;
import com.laoyancheng.www.wxmarketbackend.service.AliyunSMSService;
import com.laoyancheng.www.wxmarketbackend.service.MarketUserService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import jakarta.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/13 22:56
 */
@RestController
@RequestMapping("wx/auth")
public class WxAuthController {
    @Autowired
    private AliyunSMSService aliyunSMSService;
    @Autowired
    private SecurityManager securityManager;
    @Autowired
    private MarketUserService userService;
    @PostMapping("regCaptcha")
    public Object regCaptcha(@RequestBody PhoneNum phoneNum){
        // 获取用户的手机号码
        String mobile = phoneNum.getMobile();
        if(!mobile.matches("^1\\d{10}$")){
            // 电话号码不符合格式
            return ResponseUtil.illegalPhoneNumber();
        }
        // 向用户发送短信
        aliyunSMSService.sendCode(mobile);
        return ResponseUtil.ok();
    }
    @PostMapping("register")
    public Object register(@RequestBody @Valid UserRegisterDTO userRegisterDTO){

        return null;
    }
    @PostMapping("login")
    public Object login(@RequestBody MarketUser user){
        // Shiro认证
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        MarketUser marketUser = userService.selectOneByUsername(user.getUsername());
        HashMap<String, Object> data = new HashMap<>();
        data.put("token", token);
        HashMap<String, Object> userInfo = new HashMap<>();
        userInfo.put("avatarUrl", marketUser.getAvatar());
        userInfo.put("nickName", user.getUsername());
        data.put("userInfo", userInfo);
        return ResponseUtil.ok(data);
    }

    @PostMapping("logout")
    public Object logout(){
        SecurityUtils.setSecurityManager(securityManager);
        SecurityUtils.getSubject().logout();
        return ResponseUtil.ok();
    }
}
