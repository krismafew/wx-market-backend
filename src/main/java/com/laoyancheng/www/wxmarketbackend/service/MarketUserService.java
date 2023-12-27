package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketUser;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/13 19:48
 */

public interface MarketUserService {
    MarketUser selectOneByUsername(String username);
}
