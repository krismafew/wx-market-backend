package com.laoyancheng.www.wxmarketbackend;

import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 17:23
 */
public class IntegerEqualTest {
    @Test
    public void testIntegerEqual(){
        Integer num1 = 500;
        Integer num2 = 500;
        int num3 = 500;
        System.out.println("对象==对象: " + (num1 == num2));
        System.out.println("对象==int: " + (num1 == num3));
        System.out.println("对象.equals(对象): " + (num1.equals(num2)));

    }
}
