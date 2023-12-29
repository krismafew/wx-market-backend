package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCouponUser;

public interface MarketCouponUserService {
    MarketCouponUser selectUserCouponById(Integer userCouponId);

    Integer countAvailableCouponsByUserId(Integer userId);
}
