package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketUser;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketUserExample;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketUserMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/13 19:49
 */
@Service
public class MarketUserServiceImpl implements MarketUserService {
    @Autowired
    private MarketUserMapper userMapper;

    @Override
    public MarketUser selectOneByUsername(String username) {
        MarketUserExample marketUserExample = new MarketUserExample();
        marketUserExample.or().andUsernameEqualTo(username).andDeletedEqualTo(false);
        return userMapper.selectOneByExample(marketUserExample);
    }

    @Override
    public List<MarketUser> selectUsersByIdList(List<Integer> userIdList) {
        MarketUserExample marketUserExample = new MarketUserExample();
        marketUserExample.createCriteria().andDeletedEqualTo(false).andIdIn(userIdList);
        return userMapper.selectByExample(marketUserExample);
    }
}
