package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.service.MarketCategoryService;
import com.laoyancheng.www.wxmarketbackend.service.MarketGoodsService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("category")
    public Object category(Integer id) {
        if(id == null)
            return ResponseUtil.badArgument();
        return ResponseUtil.ok(categoryService.selectBroParentCategoriesByCategoryId(id));
    }
}
