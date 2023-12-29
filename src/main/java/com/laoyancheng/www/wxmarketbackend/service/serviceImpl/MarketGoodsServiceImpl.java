package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGoodsExample;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketGoodsMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/28 22:57
 */
@Service
public class MarketGoodsServiceImpl implements MarketGoodsService {
    @Autowired
    private MarketGoodsMapper goodsMapper;
    @Override
    public List selectGoodsByCategoryId(Integer categoryId, Integer page, Integer limit) {
        MarketGoodsExample marketGoodsExample = new MarketGoodsExample();
        marketGoodsExample.createCriteria().andCategoryIdEqualTo(categoryId).andDeletedEqualTo(false);
        PageHelper.startPage(page, limit);
        return goodsMapper.selectByExample(marketGoodsExample);
    }

    @Override
    public Integer countGoods() {
        MarketGoodsExample marketGoodsExample = new MarketGoodsExample();
        marketGoodsExample.createCriteria().andIsOnSaleEqualTo(true).andDeletedEqualTo(false);
        return goodsMapper.selectByExample(marketGoodsExample).size();
    }
}
