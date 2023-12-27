package com.laoyancheng.www.wxmarketbackend;

import com.laoyancheng.www.wxmarketbackend.util.RandomUtil;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.junit.jupiter.api.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/27 16:04
 */
public class SHA256Test {
    @Test
    public void testSHA256(){
        String password = "admin123";
        /*String salt = RandomUtil.generateSalt();*/
        String salt = "Qtitul33qMx+EHFFm7DiTg==";

        // 经过SHA-256哈希过的16位16进制字符串
        MessageDigest sha256 = null;
        StringBuilder sb = new StringBuilder();
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        sha256.update((salt + password).getBytes());
        byte[] digests = sha256.digest();
        // 将digests是一个长度32的byte数组
        // 将digests转化为长度为16的16进制字符串
        for(byte digest : digests){
            sb.append(Integer.toString((digest & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println("salt: " + salt);
        System.out.println("hashedpassword: " + sb);
    }
}
