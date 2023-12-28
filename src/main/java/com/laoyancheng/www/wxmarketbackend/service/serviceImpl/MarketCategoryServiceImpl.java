package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCategory;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCategoryExample;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketCategoryMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/28 22:59
 */
@Service
public class MarketCategoryServiceImpl implements MarketCategoryService {
    @Autowired
    private MarketCategoryMapper categoryMapper;
    @Transactional
    @Override
    public Object selectBroParentCategoriesByCategoryId(Integer id) {
        // 先找到categoryId对应的类目, 然后寻找父目录, 在通过currentCategory的pid找到所有的兄弟类目
        MarketCategoryExample marketCategoryExample = new MarketCategoryExample();
        marketCategoryExample.createCriteria().andIdEqualTo(id).andDeletedEqualTo(false);
        MarketCategory currentCategory = categoryMapper.selectOneByExample(marketCategoryExample);

        // 通过currentCategory的pid来找到父类目
        marketCategoryExample.clear();
        marketCategoryExample.createCriteria().andIdEqualTo(currentCategory.getPid()).andDeletedEqualTo(false);
        MarketCategory parentCategory = categoryMapper.selectOneByExample(marketCategoryExample);

        // 通过currentCategory的pid找到所有的兄弟类目
        marketCategoryExample.clear();
        marketCategoryExample.createCriteria().andPidEqualTo(currentCategory.getPid())
                .andLevelEqualTo("L2")
                .andDeletedEqualTo(false);
        List<MarketCategory> brotherCategories = categoryMapper.selectByExample(marketCategoryExample);

        HashMap<String, Object> data = new HashMap<>();
        data.put("brotherCategory", brotherCategories);
        data.put("currentCategory", currentCategory);
        data.put("parentCategory", parentCategory);
        return data;

    }
}
