package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCouponUser;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCouponUserExample;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketCouponUserMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketCouponUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 23:14
 */
@Service
public class MarketCouponUserServiceImpl implements MarketCouponUserService {
    @Autowired
    private MarketCouponUserMapper couponUserMapper;
    @Override
    public MarketCouponUser selectUserCouponById(Integer userCouponId) {
        return couponUserMapper.selectByPrimaryKey(userCouponId);
    }

    @Override
    public Integer countAvailableCouponsByUserId(Integer userId) {
        MarketCouponUserExample marketCouponUserExample = new MarketCouponUserExample();
        marketCouponUserExample.createCriteria().andUserIdEqualTo(userId).andDeletedEqualTo(false).andStatusEqualTo((short)0);
        return couponUserMapper.selectByExample(marketCouponUserExample).size();

    }
}
