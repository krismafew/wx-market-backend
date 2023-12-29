package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddress;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddressExample;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketAddressMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 23:46
 */
@Service
public class MarketAddressServiceImpl implements MarketAddressService {
    @Autowired
    private MarketAddressMapper addressMapper;
    @Override
    public MarketAddress selectDefaultAddressByUserId(Integer userId) {
        MarketAddressExample marketAddressExample = new MarketAddressExample();
        marketAddressExample.createCriteria().andUserIdEqualTo(userId).andIsDefaultEqualTo(true).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(marketAddressExample);
    }

    @Override
    public MarketAddress selectAddressById(Integer addressId) {
        return addressMapper.selectByPrimaryKey(addressId);
    }
}
