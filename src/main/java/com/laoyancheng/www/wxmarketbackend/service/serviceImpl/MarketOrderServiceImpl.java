package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketOrderMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/27 21:45
 */
@Service
public class MarketOrderServiceImpl implements MarketOrderService {
    @Autowired
    private MarketOrderMapper orderMapper;
    @Override
    public Map<String, Integer> countOrdersByUsername(String principal) {
        Map<String, Integer> order = new HashMap<>();
        order.put("unpaid", orderMapper.countUnpaidOrdersByUsername(principal));
        order.put("unship", orderMapper.countUnshipOrdersByUsername(principal));
        order.put("unrecv", orderMapper.countUnreceivedOrdersByUsername(principal));
        order.put("uncomment", orderMapper.countUncommentOrdersByUsername(principal));
        return order;
    }
}
