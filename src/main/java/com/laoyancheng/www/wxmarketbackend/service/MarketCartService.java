package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.dto.AddCartDTO;
import com.laoyancheng.www.wxmarketbackend.db.dto.CartCheckDTO;
import com.laoyancheng.www.wxmarketbackend.db.dto.CartDTO;

import java.util.List;
import java.util.Map;

public interface MarketCartService {
    Integer updateCartItem(CartDTO itemDTO);

    Map<String, Object> deleteCart(Integer userId, List<Integer> productIds);

    Integer countGoods(Integer userId);

    Integer addCart(Integer userId, Integer goodsId, Integer productId, Short number);

    Map<String, Object> index(Integer userId);

    Map<String, Object> checkCart(Integer userId, List<Integer> productIds, Short isChecked);

    Integer fastAdd(Integer userId, Integer goodsId, Integer productId, Short number);

    Map<String, Object> checkout(Integer userId, Integer cartId, Integer addressId, Integer couponId, Integer userCouponId, Integer grouponRulesId);
}
