package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketBrand;

import java.util.List;

public interface MarketBrandService {
    List<MarketBrand> list();

    MarketBrand selectBrandById(Integer id);
}
