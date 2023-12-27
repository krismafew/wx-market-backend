package com.laoyancheng.www.wxmarketbackend.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/25 15:11
 */
@Component
@ConfigurationProperties(prefix = "aliyun")
public class AliyunComponent {
    private String accessKeyId;
    private String accessKeySecret;
    private AliyunSMS sms;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public AliyunSMS getSms() {
        return sms;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public void setSms(AliyunSMS sms) {
        this.sms = sms;
    }
}
