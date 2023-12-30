package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.*;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketTopicMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketGoodsService;
import com.laoyancheng.www.wxmarketbackend.service.MarketTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 15:37
 */
@Service
public class MarketTopicServiceImpl implements MarketTopicService {
    @Autowired
    private MarketTopicMapper topicMapper;
    @Autowired
    private MarketGoodsService goodsService;
    @Override
    public List<MarketTopic> selectTopicsByIdList(ArrayList<Integer> idList) {
        return topicMapper.selectTopicsByIdList(idList);
    }

    @Override
    public Object list() {
        MarketTopicExample marketTopicExample = new MarketTopicExample();
        marketTopicExample.createCriteria().andDeletedEqualTo(false);
        List<MarketTopic> marketTopics = topicMapper.selectByExample(marketTopicExample);
        ArrayList<MarketTopic> randomList = new ArrayList<>();
        if(marketTopics.size() < 4)
            return marketTopics;
        else{
            int[] randomArr = new Random().ints(0, marketTopics.size())
                    .limit(4)
                    .distinct()
                    .toArray();
            for(int i : randomArr){
                randomList.add(marketTopics.get(i));
            }
            return randomList;
        }
    }

    @Override
    public Object selectDetailTopic(Integer id) {
        // 根据topicId查询MarketTopic
        MarketTopicExample marketTopicExample = new MarketTopicExample();
        marketTopicExample.createCriteria().andIdEqualTo(id).andDeletedEqualTo(false);
        MarketTopic topic = topicMapper.selectOneByExample(marketTopicExample);
        if(topic == null)
            return null;
        Integer[] goodsIdList = topic.getGoods();
        List<MarketGoods> goods = goodsService.selectGoodsByIdList(Arrays.asList(goodsIdList));
        HashMap<String, Object> data = new HashMap<>();
        data.put("goods", goods);
        data.put("topic", topic);
        return data;
    }

    @Override
    public List selectRelatedTopics(Integer id) {
        MarketTopicExample marketTopicExample = new MarketTopicExample();
        marketTopicExample.createCriteria().andDeletedEqualTo(false).andIdNotEqualTo(id);
        List<MarketTopic> marketTopics = topicMapper.selectByExample(marketTopicExample);
        ArrayList<MarketTopic> randomList = new ArrayList<>();
        if(marketTopics.size() < 4)
            return marketTopics;
        else{
            int[] randomArr = new Random().ints(0, marketTopics.size())
                    .limit(4)
                    .distinct()
                    .toArray();
            for(int i : randomArr){
                randomList.add(marketTopics.get(i));
            }
            return randomList;
        }
    }

    @Override
    public MarketTopic selectTopicById(Integer valueId) {
        return topicMapper.selectByPrimaryKey(valueId);
    }
}
