package com.laoyancheng.www.wxmarketbackend.config;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/25 15:15
 */
public class AliyunSMS {
    private String signName;
    private String templateCode;

    public String getSignName() {
        return signName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
}
