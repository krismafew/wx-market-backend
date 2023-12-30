package com.laoyancheng.www.wxmarketbackend;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 16:12
 */
public class GenerateMobileTest {
    @Test
    public void testGenerateMobile(){
        for(int i = 0; i < 10; i++){
            IntStream randomNumbers = IntStream.generate(() -> new Random().nextInt(10)).limit(11);
            String collect = randomNumbers.mapToObj(String::valueOf).collect(Collectors.joining());
            System.out.println(collect);
        }
    }
}
