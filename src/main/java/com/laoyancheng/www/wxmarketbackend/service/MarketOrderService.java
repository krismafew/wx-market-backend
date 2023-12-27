package com.laoyancheng.www.wxmarketbackend.service;

import java.util.Map;

public interface MarketOrderService {
    Map<String, Integer> countOrdersByUsername(String principal);
}
