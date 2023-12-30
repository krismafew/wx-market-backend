package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketTopic;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketTopicMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 15:37
 */
@Service
public class MarketTopicServiceImpl implements MarketTopicService {
    @Autowired
    private MarketTopicMapper topicMapper;
    @Override
    public List<MarketTopic> selectTopicsByIdList(ArrayList<Integer> idList) {
        return topicMapper.selectTopicsByIdList(idList);
    }
}
