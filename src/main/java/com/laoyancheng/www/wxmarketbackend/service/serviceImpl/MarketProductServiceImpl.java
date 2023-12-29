package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGoodsProduct;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGoodsProductExample;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketGoodsProductMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 17:22
 */
@Service
public class MarketProductServiceImpl implements MarketProductService {
    @Autowired
    private MarketGoodsProductMapper productMapper;

    @Override
    public Integer selectGoodsIdByProductId(Integer productId) {
        MarketGoodsProductExample marketGoodsProductExample = new MarketGoodsProductExample();
        marketGoodsProductExample.createCriteria().andIdEqualTo(productId).andDeletedEqualTo(false);
        MarketGoodsProduct marketGoodsProduct = productMapper.selectOneByExample(marketGoodsProductExample);
        return marketGoodsProduct.getGoodsId();
    }

    @Override
    public MarketGoodsProduct selectGoodsProductById(Integer productId) {
        return productMapper.selectByPrimaryKey(productId);
    }
}
