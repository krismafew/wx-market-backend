package com.laoyancheng.www.wxmarketbackend;

import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/26 15:45
 */
public class RegexQuantifierTest {
    @Test
    public void testQuantifier(){
        String str = "100000";
        System.out.println(str.matches("^\\d{2,5}$"));
    }
}
