package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddress;

import java.util.List;

public interface MarketAddressService {
    MarketAddress selectDefaultAddressByUserId(Integer userId);

    MarketAddress selectAddressById(Integer addressId);

    List<MarketAddress> list(Integer userId);

    MarketAddress getAddressById(Integer userId, Integer id);

    Integer saveAndUpdate(Integer userId, String addressDetail, String areaCode, String city, String county, Integer id, boolean isDefault, String name, String province, String tel);

    Integer delete(Integer userId, Integer id);
}
