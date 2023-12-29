package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCoupon;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketCouponMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 23:29
 */
@Service
public class MarketCouponServiceImpl implements MarketCouponService {
    @Autowired
    private MarketCouponMapper couponMapper;
    @Override
    public MarketCoupon selectCouponById(Integer couponId) {
        return couponMapper.selectByPrimaryKey(couponId);
    }
}
