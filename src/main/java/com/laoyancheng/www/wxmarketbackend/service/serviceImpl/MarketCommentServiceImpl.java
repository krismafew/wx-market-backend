package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketComment;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCommentExample;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketUser;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketCommentMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketCommentService;
import com.laoyancheng.www.wxmarketbackend.service.MarketGoodsService;
import com.laoyancheng.www.wxmarketbackend.service.MarketTopicService;
import com.laoyancheng.www.wxmarketbackend.service.MarketUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 23:05
 */
@Service
public class MarketCommentServiceImpl implements MarketCommentService {
    @Autowired
    private MarketCommentMapper commentMapper;
    @Autowired
    private MarketUserService userService;
    @Autowired
    private MarketGoodsService goodsService;

    @Autowired
    private MarketTopicService topicService;
    @Override
    public List<Object> listComments(Integer valueId, Byte type, Integer limit, Integer page, Byte showType) {
        MarketCommentExample marketCommentExample = new MarketCommentExample();
        marketCommentExample.createCriteria().andValueIdEqualTo(valueId).andTypeEqualTo(type).andDeletedEqualTo(false);
        PageHelper.startPage(page, limit);
        List<MarketComment> marketComments = commentMapper.selectByExample(marketCommentExample);
        ArrayList<Integer> userIdList = new ArrayList<>();
        for(MarketComment comment : marketComments){
            userIdList.add(comment.getUserId());
        }
        // 根据idList查询user集合
        List<MarketUser> userList = userService.selectUsersByIdList(userIdList);
        HashMap<Integer, Object> userInfoMap = new HashMap<>();
        for(MarketUser user : userList){
            HashMap<String, Object> userInfo = new HashMap<>();
            userInfo.put("avatarUrl", user.getAvatar());
            userInfo.put("nickName", user.getUsername());
            userInfoMap.put(user.getId(), userInfo);
        }

        ArrayList<Object> list = new ArrayList<>();
        for(MarketComment comment : marketComments){
            HashMap<String, Object> data = new HashMap<>();
            data.put("addTime", comment.getAddTime());
            data.put("adminContent", comment.getAdminContent());
            data.put("content", comment.getContent());
            data.put("picList", comment.getPicUrls());
            data.put("userInfo", userInfoMap.get(comment.getUserId()));
            list.add(data);
        }

        return list;
    }

    @Override
    public Integer count(Integer valueId, Byte type) {
        MarketCommentExample marketCommentExample = new MarketCommentExample();
        marketCommentExample.createCriteria().andValueIdEqualTo(valueId).andDeletedEqualTo(false).andTypeEqualTo(type);
        return commentMapper.selectByExample(marketCommentExample).size();
    }

    @Override
    public MarketComment post(Integer userId, String content, boolean hasPicture, String[] picUrls, Short star, Byte type, Integer valueId) {
        Object target = null;
        if(type.equals((byte)0)){
            target = goodsService.selectGoodsById(valueId);
        }else {
            target = topicService.selectTopicById(valueId);
        }
        if(target == null)
            return null;

        MarketComment comment = new MarketComment();
        comment.setAddTime(new Date());
        comment.setContent(content);
        comment.setHasPicture(hasPicture);
        comment.setPicUrls(picUrls);
        comment.setStar(star);
        comment.setType(type);
        comment.setUpdateTime(new Date());
        comment.setUserId(userId);
        comment.setValueId(valueId);

        // 插入到market_comment中去
        commentMapper.insert(comment);
        return comment;
    }
}
