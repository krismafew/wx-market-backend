package com.laoyancheng.www.wxmarketbackend.config;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.teaopenapi.models.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: 配置类
 * @Author: JuRan
 * @Date: 2023/12/25 16:27
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Bean("smsClient")
    public Client getClient() throws Exception {
        Config config = new Config()
                // 必填，您的 AccessKey ID
                .setAccessKeyId(System.getenv("ALIBABA_CLOUD_ACCESS_KEY_ID"))
                // 必填，您的 AccessKey Secret
                .setAccessKeySecret(System.getenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET"));
        // Endpoint
        config.setEndpoint("dysmsapi.aliyuncs.com");
        return new Client(config);
    }
}
