package com.laoyancheng.www.wxmarketbackend;

import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 22:33
 */
public class ReplaceFilenameTest {
    @Test
    public void testReplaceFilenameWithRegex(){
        String filename = "哆啦A梦.jpg";
        Pattern pattern = Pattern.compile("^.+(\\.[^.]+)$");
        Matcher matcher = pattern.matcher(filename);
        while (matcher.find()){
            String newFilename = UUID.randomUUID() + matcher.group(1);
            System.out.println(newFilename);
        }
    }
}
