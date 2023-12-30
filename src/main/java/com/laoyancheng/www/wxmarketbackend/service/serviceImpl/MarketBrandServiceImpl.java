package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketBrand;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketBrandExample;
import com.laoyancheng.www.wxmarketbackend.db.mapper.MarketBrandMapper;
import com.laoyancheng.www.wxmarketbackend.service.MarketBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 19:53
 */
@Service
public class MarketBrandServiceImpl implements MarketBrandService {
    @Autowired
    private MarketBrandMapper brandMapper;
    @Override
    public List<MarketBrand> list() {
        MarketBrandExample marketBrandExample = new MarketBrandExample();
        marketBrandExample.createCriteria().andDeletedEqualTo(false);
        List<MarketBrand> marketBrands = brandMapper.selectByExample(marketBrandExample);
        ArrayList<MarketBrand> randomList = new ArrayList<>();
        if(marketBrands.size() < 4)
            return marketBrands;
        else{
            int[] randomArr = new Random().ints(0, marketBrands.size())
                    .limit(4)
                    .distinct()
                    .toArray();
            for(int i : randomArr){
                randomList.add(marketBrands.get(i));
            }
            return randomList;
        }
    }

    @Override
    public MarketBrand selectBrandById(Integer id) {
        return brandMapper.selectByPrimaryKey(id);
    }
}
