package com.laoyancheng.www.wxmarketbackend.config;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/13 21:17
 */
@Configuration
@Component
public class ShiroConfig {
    @Bean
    public SecurityManager securityManager(Realm realm, SessionManager sessionManager){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setSessionManager(sessionManager);
        securityManager.setRealm(realm);
        return securityManager;
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition(SecurityManager securityManager){
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();

        chainDefinition.addPathDefinition("/wx/auth/login", "anno");
        chainDefinition.addPathDefinition("/wx/static", "anno");
        chainDefinition.addPathDefinition("/wx/auth/logout", "logout");
        chainDefinition.addPathDefinition("/wx/**", "authc");


        return chainDefinition;
    }
}
