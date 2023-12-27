package com.laoyancheng.www.wxmarketbackend.config;

import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.session.mgt.DefaultSessionManager;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/27 16:55
 */
@Component
public class CustomShiroSessionManagement extends DefaultSessionManager {
}
