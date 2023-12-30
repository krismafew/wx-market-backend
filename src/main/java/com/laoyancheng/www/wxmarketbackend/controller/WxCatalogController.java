package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.service.MarketCategoryService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 20:12
 */
@RestController
@RequestMapping("wx/catalog")
public class WxCatalogController {
    @Autowired
    MarketCategoryService categoryService;
    @GetMapping("index")
    public Object index(){
        return ResponseUtil.ok(categoryService.index());
    }

    @GetMapping("current")
    public Object current(@RequestParam("id") @Min(value = 1, message = "id must be a positive integer") Integer id){
        Object data = categoryService.listL1CategoryAndSubCategoriesByL1Id(id);
        if(data == null){
            // L1CategoryId 参数不对
            return ResponseUtil.badArgumentValue();
        }
        return ResponseUtil.ok(data);
    }
}
