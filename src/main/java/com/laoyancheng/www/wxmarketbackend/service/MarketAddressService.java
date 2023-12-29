package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddress;

public interface MarketAddressService {
    MarketAddress selectDefaultAddressByUserId(Integer userId);

    MarketAddress selectAddressById(Integer addressId);
}
