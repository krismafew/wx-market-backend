package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGoods;

import java.util.ArrayList;
import java.util.List;

public interface MarketGoodsService {
    List<MarketGoods> selectGoodsByCategoryId(Integer categoryId, Integer page, Integer limit);

    Integer countGoods();

    MarketGoods selectGoodsById(Integer goodsId);

    List<MarketGoods> selectGoodsByIdList(List<Integer> idList);
}
