package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGoodsProduct;

public interface MarketProductService {
    Integer selectGoodsIdByProductId(Integer productId);

    MarketGoodsProduct selectGoodsProductById(Integer productId);
}
