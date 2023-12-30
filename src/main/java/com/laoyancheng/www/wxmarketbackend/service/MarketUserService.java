package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/13 19:48
 */

public interface MarketUserService {
    MarketUser selectOneByUsername(String username);

    List<MarketUser> selectUsersByIdList(List<Integer> userIdList);
}
