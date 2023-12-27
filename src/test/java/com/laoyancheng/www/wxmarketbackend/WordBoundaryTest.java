package com.laoyancheng.www.wxmarketbackend;

import org.junit.jupiter.api.Test;

/**
 * @Description: 测试regex中的\b
 * @Author: JuRan
 * @Date: 2023/12/26 13:01
 */
public class WordBoundaryTest {
    @Test
    public void testRegexWordBoundary(){
        // Java.util.Regex中, \b的范围是Unicode范围的文字字符
        String str = " ";
        System.out.println(str.matches("^\\b \\b$"));
    }
}
