package com.laoyancheng.www.wxmarketbackend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/10 19:14
 */
@Configuration
@ComponentScan("com.laoyancheng.www.wxmarketbackend")
public class WebMvcConfig implements WebMvcConfigurer {

}
