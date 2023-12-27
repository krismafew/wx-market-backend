package com.laoyancheng.www.wxmarketbackend;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: 测试token.getUsername和token.getPrincipals的区别
 * @Author: JuRan
 * @Date: 2023/12/13 17:24
 */
@SpringBootTest
public class TokenGetPrincipalTest {
    @Autowired
    private SecurityManager securityManager;
    @Test
    public void testToken(){
        UsernamePasswordToken token = new UsernamePasswordToken("juran", "123456");
        Object principal = token.getPrincipal();
        String username = token.getUsername();
        Object credentials = token.getCredentials();
        char[] password = token.getPassword();
        System.out.println(securityManager);
    }
}
