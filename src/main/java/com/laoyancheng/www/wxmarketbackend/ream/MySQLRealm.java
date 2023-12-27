package com.laoyancheng.www.wxmarketbackend.ream;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketUser;
import com.laoyancheng.www.wxmarketbackend.service.MarketUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/13 17:01
 */
@Component
public class MySQLRealm extends AuthorizingRealm {
    @Autowired
    private MarketUserService marketUserService;
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 向下转型为UsernamePasswordToken
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        // 获取用户名和密码
        String username = token.getUsername();
        String inputPassword = String.valueOf(token.getPassword());
        // 通过username获取User对象
        MarketUser user = marketUserService.selectOneByUsername(username);
        // user对象为null, 返回异常UnknownAccountException
        if(user == null)
            throw  new UnknownAccountException();
        // 获取盐和hashedPassword
        String salt = user.getSalt();
        String storedPassword = user.getPassword();
        // 获取md5
        MessageDigest sha256 = null;
        StringBuilder sb = new StringBuilder();
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        sha256.update((salt + inputPassword).getBytes());
        byte[] digests = sha256.digest();
        // 将digests是一个长度32的byte数组
        // 将digests转化为长度为16的16进制字符串
        for(byte digest : digests){
            sb.append(Integer.toString((digest & 0xff) + 0x100, 16).substring(1));
        }
        // 判断经过加盐处理的用户输入密码是否和数据库中存储的字符串相同
        if(!StringUtils.equals(sb, storedPassword)){
            // 不同，抛出异常IncorrectCredentialsException，通过Exception类来捕获
            throw new IncorrectCredentialsException();
        }
        // 判断相同
        return new SimpleAuthenticationInfo(username, inputPassword, getName());
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
