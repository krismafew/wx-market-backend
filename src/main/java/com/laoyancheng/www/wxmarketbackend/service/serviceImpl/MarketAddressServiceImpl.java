package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddress;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddressExample;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketAddressMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List list(Integer userId) {
        MarketAddressExample marketAddressExample = new MarketAddressExample();
        marketAddressExample.createCriteria().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        return addressMapper.selectByExample(marketAddressExample);
    }

    @Override
    public MarketAddress getAddressById(Integer userId, Integer id) {
        MarketAddressExample marketAddressExample = new MarketAddressExample();
        marketAddressExample.createCriteria().andUserIdEqualTo(userId).andIdEqualTo(id).andDeletedEqualTo(false);
        return addressMapper.selectOneByExample(marketAddressExample);
    }

    @Override
    public Integer saveAndUpdate(Integer userId, String addressDetail, String areaCode, String city, String county, Integer id, boolean isDefault, String name, String province, String tel) {
        MarketAddress address = new MarketAddress();
        if(id != 0) {
            address = addressMapper.selectByPrimaryKey(id);
            if(address == null)
                // addressId不存在
                return null;
        }
        address.setAddressDetail(addressDetail);
        address.setAreaCode(areaCode);
        address.setCity(city);
        address.setCounty(county);
        address.setName(name);
        address.setProvince(province);
        address.setTel(tel);

        // isDefault
        // 分为6种情况:
        // 1.false -> true   id != 0
        // 2.false -> false  id != 0
        // 3.true -> true    id != 0
        // 4.true -> false   id != 0
        // 5. id == 0, -> true
        // 6. id == 0, -> false
        // 后三种情况下
        // 1&5, 需要查询出所有用户相关的地址集合，遍历让地址isDefault为false
        // 2~4, address.isDefault不进行修改
        // 6. address.isDefault赋值false即可
        // 3&4&2(用户相关的地址只有它一个,但不是默认，这种不存高并发的情况下不存在)
        if(id != 0){
            if(isDefault && !address.getIsDefault()){
                // 非默认改为默认
                address.setIsDefault(true);
                // 查询用户的其余地址集合
                MarketAddressExample marketAddressExample = new MarketAddressExample();
                marketAddressExample.createCriteria().andUserIdEqualTo(userId).andIdNotEqualTo(id).andDeletedEqualTo(false);
                List<MarketAddress> addressList = addressMapper.selectByExample(marketAddressExample);
                if(addressList.size() != 0){
                    // 将原默认地址改为非默认
                    for(MarketAddress addr : addressList){
                        if(addr.getIsDefault()){
                            address.setIsDefault(false);
                            addressMapper.updateByPrimaryKey(addr);
                        }
                    }
                }
            }
            addressMapper.updateByPrimaryKey(address);
            return id;
        }
        // id == 0
        // 用户新建地址
        MarketAddressExample marketAddressExample = new MarketAddressExample();
        marketAddressExample.createCriteria().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        List<MarketAddress> addressList = addressMapper.selectByExample(marketAddressExample);
        if(isDefault || addressList.size() == 0){
            address.setIsDefault(true);
            for(MarketAddress addr : addressList){
                if(addr.getIsDefault()){
                    address.setIsDefault(false);
                    addressMapper.updateByPrimaryKey(addr);
                }
            }
        }else {
            address.setIsDefault(false);
        }
        addressMapper.insert(address);
        return address.getId();
    }

    @Override
    public Integer delete(Integer userId, Integer id) {
        // 通过id查询MarketAddress对象
        MarketAddressExample marketAddressExample = new MarketAddressExample();
        marketAddressExample.createCriteria().andUserIdEqualTo(userId).andIdEqualTo(id).andDeletedEqualTo(false);
        MarketAddress address = addressMapper.selectOneByExample(marketAddressExample);
        if(address == null)
            return 400;
        address.setDeleted(true);
        addressMapper.updateByPrimaryKey(address);
        return 500;
    }
}
