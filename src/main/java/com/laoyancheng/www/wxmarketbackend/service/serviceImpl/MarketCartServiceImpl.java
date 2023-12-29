package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.*;
import com.laoyancheng.www.wxmarketbackend.db.dto.AddCartDTO;
import com.laoyancheng.www.wxmarketbackend.db.dto.CartCheckDTO;
import com.laoyancheng.www.wxmarketbackend.db.dto.CartDTO;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketCartMapper;
import com.laoyancheng.www.wxmarketbackend.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 15:25
 */
@Service
public class MarketCartServiceImpl implements MarketCartService {
    @Autowired
    private MarketCartMapper cartMapper;
    @Autowired
    private MarketGoodsService goodsService;
    @Autowired
    private MarketProductService productService;
    @Autowired
    private MarketCouponUserService couponUserService;
    @Autowired
    private MarketCouponService couponService;
    @Autowired
    private MarketAddressService addressService;

    @Override
    public Integer updateCartItem(CartDTO itemDTO) {
        // 首先通过id找到对应的MarketCart
        MarketCart marketCart = cartMapper.selectByPrimaryKey(itemDTO.getId());

        if(!itemDTO.getGoodsId().equals(marketCart.getGoodsId()) || !itemDTO.getProductId().equals(marketCart.getProductId())){
            // itemDTO对应字段和marketCart不相符，返回400
            return 400;
        }

        // 修改marketCart的number字段
        marketCart.setNumber(itemDTO.getNumber());
        // 根据cartId修改数据库数据行
        cartMapper.updateByPrimaryKey(marketCart);
        // 成功修改购物车item商品数量
        // 返回200
        return 200;
    }


    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Map<String, Object> deleteCart(Integer userId, List<Integer> productIds) {
        // 根据userId和productId查询购物车
        MarketCartExample marketCartExample = new MarketCartExample();
        marketCartExample.createCriteria().andUserIdEqualTo(userId).andProductIdIn(productIds).andDeletedEqualTo(false);
        // 根据example逻辑删除购物车
        cartMapper.logicalDeleteByExample(marketCartExample);

       return this.index(userId);
    }

    @Transactional
    @Override
    public Integer countGoods(Integer userId) {
        MarketCartExample marketCartExample = new MarketCartExample();
        marketCartExample.createCriteria().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        List<MarketCart> marketCarts = cartMapper.selectByExample(marketCartExample);
        int count = 0;
        for(MarketCart cart : marketCarts){
            count += cart.getNumber();
        }
        return count;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Integer addCart(Integer userId, Integer goodsId, Integer productId, Short number) {
        // 根据goodsId查询MarketGoods
        MarketGoods goods = goodsService.selectGoodsById(goodsId);
        // 根据productId查询MarketGoodsProduct
        MarketGoodsProduct product = productService.selectGoodsProductById(productId);
        // 封装cart
        MarketCart cart = new MarketCart();
        cart.setUserId(userId);
        cart.setGoodsId(goods.getId());
        cart.setGoodsSn(goods.getGoodsSn());
        cart.setGoodsName(goods.getName());
        cart.setProductId(product.getId());
        cart.setPrice(product.getPrice());
        cart.setNumber(number);
        cart.setSpecifications(product.getSpecifications());
        cart.setChecked(true);
        cart.setPicUrl(product.getUrl());
        cart.setAddTime(new Date());
        cart.setUpdateTime(new Date());
        cart.setDeleted(false);

        // 插入到market_cart中去
        cartMapper.insert(cart);

        return this.countGoods(userId);
    }

    @Transactional
    @Override
    public Map<String, Object> index(Integer userId) {
        MarketCartExample marketCartExample = new MarketCartExample();
        marketCartExample.createCriteria().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        List<MarketCart> undeletedCartList = cartMapper.selectByExample(marketCartExample);

        // 遍历未删除的购物车，计算checkedGoodsAmount， checkedGoodsCount， goodsAmount， goodsCount
        BigDecimal checkedGoodsAmount = new BigDecimal(0);
        BigDecimal goodsAmount = new BigDecimal(0);
        int checkedGoodsCount = 0;
        int goodsCount = 0;

        for(MarketCart cart : undeletedCartList){
            if(cart.getChecked()){
                checkedGoodsAmount = checkedGoodsAmount.add(new BigDecimal(cart.getNumber()).multiply(cart.getPrice()));
                checkedGoodsCount += cart.getNumber();
            }
            goodsAmount = goodsAmount.add(new BigDecimal(cart.getNumber()).multiply(cart.getPrice()));
            goodsCount += cart.getNumber();
        }
        HashMap<String, Object> data = new HashMap<>();
        data.put("cartList", undeletedCartList);
        HashMap<String, Object> cartTotal = new HashMap<>();
        cartTotal.put("checkedGoodsAmount", checkedGoodsAmount);
        cartTotal.put("checkedGoodsCount", checkedGoodsCount);
        cartTotal.put("goodsAmount", goodsAmount);
        cartTotal.put("goodsCount", goodsCount);
        data.put("cartTotal", cartTotal);
        return data;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Map<String, Object> checkCart(Integer userId, List<Integer> productIds, Short isChecked) {
        MarketCartExample marketCartExample = new MarketCartExample();
        marketCartExample.createCriteria().andUserIdEqualTo(userId).andProductIdIn(productIds).andDeletedEqualTo(false);
        List<MarketCart> marketCarts = cartMapper.selectByExample(marketCartExample);
        for(MarketCart cart : marketCarts){
            if(isChecked == 0)
                cart.setChecked(false);
            else
                cart.setChecked(true);
            // 将购物车update到数据库中
            cartMapper.updateByPrimaryKey(cart);
        }

        return this.index(userId);
    }

    @Override
    public Integer fastAdd(Integer userId, Integer goodsId, Integer productId, Short number) {
        // 根据goodsId查询MarketGoods
        MarketGoods goods = goodsService.selectGoodsById(goodsId);
        // 根据productId查询MarketGoodsProduct
        MarketGoodsProduct product = productService.selectGoodsProductById(productId);
        // 封装cart
        MarketCart cart = new MarketCart();
        cart.setUserId(userId);
        cart.setGoodsId(goods.getId());
        cart.setGoodsSn(goods.getGoodsSn());
        cart.setGoodsName(goods.getName());
        cart.setProductId(product.getId());
        cart.setPrice(product.getPrice());
        cart.setNumber(number);
        cart.setSpecifications(product.getSpecifications());
        cart.setChecked(true);
        cart.setPicUrl(product.getUrl());
        cart.setAddTime(new Date());
        cart.setUpdateTime(new Date());
        cart.setDeleted(false);

        // 插入到market_cart中去
        cartMapper.insert(cart);
        return cart.getId();
    }

    @Transactional
    @Override
    public Map<String, Object> checkout(Integer userId, Integer cartId, Integer addressId, Integer couponId, Integer userCouponId, Integer grouponRulesId) {
        // cartId == 0, 购物车下单
        // cartid != 0, 立即下单
        List<MarketCart> checkedGoodsList = null;
        MarketCartExample marketCartExample = new MarketCartExample();
        if(cartId == 0){
            // 购物车下单
            marketCartExample.createCriteria().andUserIdEqualTo(userId).andCheckedEqualTo(true).andDeletedEqualTo(false);
        }else {
            marketCartExample.createCriteria().andIdEqualTo(cartId).andUserIdEqualTo(userId).andCheckedEqualTo(true).andDeletedEqualTo(false);
        }
        checkedGoodsList = cartMapper.selectByExample(marketCartExample);
        if(!checkedGoodsList.get(0).getUserId().equals(userId)){
            // cartId所查询出来的MarketCart的字段userId和正在和应用交互的用户userId不匹配
            return null;
        }
        if(checkedGoodsList.size() == 0){
            // cartId参数不正确，是一个已删除cart的id, 或是一个未选中状态cart的id
            return null;
        }
        BigDecimal goodsTotalPrice = new BigDecimal(0);
        // 遍历checkedGoodsList
        for(MarketCart cart : checkedGoodsList){
            goodsTotalPrice = goodsTotalPrice.add(new BigDecimal(cart.getNumber()).multiply(cart.getPrice()));
        }

        // 根据UserCouponId查询UserCoupon
        BigDecimal couponPrice = new BigDecimal(0);
        MarketCouponUser couponUser = null;
        if(userCouponId != -1){
            couponUser = couponUserService.selectUserCouponById(userCouponId);
            if(!couponUser.getCouponId().equals(couponId))
                return null;
            MarketCoupon coupon = couponService.selectCouponById(couponId);
            if(goodsTotalPrice.compareTo(coupon.getMin()) >= 0)
                couponPrice = coupon.getDiscount();
        }
        HashMap<String, Object> data = new HashMap<>();
        BigDecimal freightPrice = new BigDecimal(0);
        BigDecimal grouponPrice = new BigDecimal(0);
        BigDecimal actualPrice = goodsTotalPrice.add(freightPrice).subtract(couponPrice);
        BigDecimal orderTotalPrice = actualPrice;

        MarketAddress checkedAddress = null;
        // addressId == 0, 选择default address
        // addressId != 0, 选择对应id的address
        if(addressId == 0){
            checkedAddress = addressService.selectDefaultAddressByUserId(userId);
        }else {
            checkedAddress = addressService.selectAddressById(addressId);
        }
        Integer availableCouponLength = couponUserService.countAvailableCouponsByUserId(userId);

        data.put("actualPrice", actualPrice);
        data.put("addressId", addressId);
        data.put("availableCouponLength", availableCouponLength);
        data.put("cartId", cartId);
        data.put("checkedAddress", checkedAddress);
        data.put("checkedGoodsList", checkedGoodsList);
        data.put("couponId", couponId);
        data.put("couponPrice", couponPrice);
        data.put("freightPrice", freightPrice);
        data.put("goodsTotalPrice", goodsTotalPrice);
        data.put("grouponPrice", grouponPrice);
        data.put("grouponRulesId", grouponRulesId);
        data.put("orderTotalPrice", orderTotalPrice);
        data.put("userCouponId", userCouponId);
        return data;
    }
}
