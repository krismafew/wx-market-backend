package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGoods;
import com.laoyancheng.www.wxmarketbackend.service.MarketCategoryService;
import com.laoyancheng.www.wxmarketbackend.service.MarketGoodsService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/28 22:55
 */
@RestController
@RequestMapping("wx/goods/")
public class WxGoodsController {
    @Autowired
    private MarketCategoryService categoryService;
    @Autowired
    private MarketGoodsService goodsService;

    @GetMapping("category")
    public Object category(@Min(value = 1, message = "id must be a positive integer") Integer id) {
        if(id == null)
            return ResponseUtil.badArgument();
        return ResponseUtil.ok(categoryService.selectBroParentCategoriesByCategoryId(id));
    }
    @GetMapping("list")
    public Object list(
            @RequestParam("categoryId") @Min(value = 1, message = "categoryId must be a positive integer")Integer categoryId,
            @RequestParam("page") @Min(value = 1, message = "page must be a positive integer")Integer page,
            @RequestParam("limit") @Min(value = 1, message = "limit must be a positive integer")Integer limit){

        // 根据categoryId，获取类目下goodsList
        List<MarketGoods> goodsList = goodsService.selectGoodsByCategoryId(categoryId, page, limit);
        return ResponseUtil.okList(goodsList);
    }
    @GetMapping("count")
    public Object count(){
        // 查询所有上架的未被删除的商品的数量
        return ResponseUtil.ok(goodsService.countGoods());
    }
}
