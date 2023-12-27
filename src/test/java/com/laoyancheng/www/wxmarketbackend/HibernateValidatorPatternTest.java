package com.laoyancheng.www.wxmarketbackend;

import com.laoyancheng.www.wxmarketbackend.db.dto.UserRegisterDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/26 15:35
 */
@SpringBootTest
public class HibernateValidatorPatternTest {

    @Test
    public void testHibernateValidatorPattern(){
        UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
        userRegisterDTO.setUsername("1");
    }
}
