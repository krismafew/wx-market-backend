package com.laoyancheng.www.wxmarketbackend.service;

import java.util.List;

public interface MarketCollectService {
    List list(Integer userId, Byte type, Integer page, Integer limit);

    void addordelete(Integer userId, Byte type, Integer valueId);
}
