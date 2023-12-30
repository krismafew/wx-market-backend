package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketComment;

import java.util.List;

public interface MarketCommentService {
    List<Object> listComments(Integer valueId, Byte type, Integer limit, Integer page, Byte showType);

    Integer count(Integer valueId, Byte type);

    MarketComment post(Integer userId, String content, boolean hasPicture, String[] picUrls, Short star, Byte type, Integer valueId);
}
