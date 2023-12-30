package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCollect;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCollectExample;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketTopic;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketCollectMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketCollectService;
import com.laoyancheng.www.wxmarketbackend.service.MarketGoodsService;
import com.laoyancheng.www.wxmarketbackend.service.MarketTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 15:27
 */
@Service
public class MarketCollectServiceImpl implements MarketCollectService {
    @Autowired
    private MarketCollectMapper collectMapper;

    @Autowired
    private MarketGoodsService goodsService;

    @Autowired
    private MarketTopicService topicService;
    @Transactional
    @Override
    public List list(Integer userId, Byte type, Integer page, Integer limit) {
        MarketCollectExample marketCollectExample = new MarketCollectExample();
        marketCollectExample.createCriteria().andUserIdEqualTo(userId).andTypeEqualTo(type).andDeletedEqualTo(false);
        PageHelper.startPage(page, limit);
        List<MarketCollect> collectList = collectMapper.selectByExample(marketCollectExample);

        // 遍历collectList, 将valueId放进idList中去
        ArrayList<Integer> idList = new ArrayList<>();
        for(MarketCollect collect : collectList){
            idList.add(collect.getValueId());
        }

        if(type.equals((byte)0)){
            // 返回收藏商品集合
            return goodsService.selectGoodsByIdList(idList);
        }
        // tpye为1, 返回收藏专题集合
        return topicService.selectTopicsByIdList(idList);
    }

    @Override
    public void addordelete(Integer userId, Byte type, Integer valueId) {
        // 已收藏
        // 查询market_collect, 若MarketCollect collect为null, 将对应的collect设置为deleted
        MarketCollectExample marketCollectExample = new MarketCollectExample();
        marketCollectExample.createCriteria().andUserIdEqualTo(userId).andTypeEqualTo(type).andValueIdEqualTo(valueId);
        MarketCollect collect = collectMapper.selectOneByExample(marketCollectExample);
        if(collect != null){
            // collect.isDeleted == true 或 false
            if(collect.getDeleted() == false){
                // 将collect逻辑删除
                collectMapper.logicalDeleteByPrimaryKey(collect.getId());
            }else {
                // 用户重新收藏
                collect.setDeleted(false);
                collect.setUpdateTime(new Date());
                collectMapper.updateByPrimaryKey(collect);
            }
            return;
        }

        // 从未被收藏过，向market_collect新增一条数据
        MarketCollect newCollect = new MarketCollect();
        newCollect.setUserId(userId);
        newCollect.setValueId(valueId);
        newCollect.setType(type);
        newCollect.setAddTime(new Date());
        newCollect.setUpdateTime(new Date());
        newCollect.setDeleted(false);

        collectMapper.insert(newCollect);
    }
}
