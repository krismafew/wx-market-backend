package com.laoyancheng.www.wxmarketbackend.config;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.session.mgt.DefaultSessionManager;
import org.apache.shiro.session.mgt.SessionKey;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/27 16:55
 */
@Component
public class CustomShiroSessionManagement extends DefaultWebSessionManager {
    private static final String WX_MARKET_TOKEN = "X-CskaoyanMarket-Token";
    @Override
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
        HttpServletRequest req = (HttpServletRequest)request;
        String token = req.getHeader(WX_MARKET_TOKEN);
        if(token != null)
            return token;
        return super.getSessionId(request, response);
    }
}
