package com.laoyancheng.www.wxmarketbackend.util;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/25 17:20
 */
public class RandomUtil {
    public static String generateCode(){
        // 生成六位随机验证码
        return new Random().ints(0, 10)
                .limit(6)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

    }

    public static String generateSalt(){
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }
}
