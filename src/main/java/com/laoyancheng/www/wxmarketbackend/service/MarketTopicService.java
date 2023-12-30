package com.laoyancheng.www.wxmarketbackend.service;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketTopic;

import java.util.ArrayList;
import java.util.List;

public interface MarketTopicService {
    List<MarketTopic> selectTopicsByIdList(ArrayList<Integer> idList);

    Object list();

    Object selectDetailTopic(Integer id);

    List selectRelatedTopics(Integer id);
}
