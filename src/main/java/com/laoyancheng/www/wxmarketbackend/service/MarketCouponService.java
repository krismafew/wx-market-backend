package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCoupon;

public interface MarketCouponService {
    MarketCoupon selectCouponById(Integer couponId);
}
