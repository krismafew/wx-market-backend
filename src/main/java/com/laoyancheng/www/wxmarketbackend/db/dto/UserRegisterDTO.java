package com.laoyancheng.www.wxmarketbackend.db.dto;


import jakarta.validation.constraints.Pattern;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/23 13:30
 */
public class UserRegisterDTO {
    @Pattern(regexp = "^[-\\w]{6,30}$", message = "用户名不合法")
    private String username;
    @Pattern(regexp = ("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[-`~!@#$%^&*()_+=|:;',.<>/?\\[\\]{}])[-\\da-zA-Z`~!@#$%^&*()_+=|:;',.<>/?\\[\\]{}]{8,}$"), message = "密码不合法")
    private String password;

    private String mobile;

    private String wxCode;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }
}
