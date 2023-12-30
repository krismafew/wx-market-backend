package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketBrand;
import com.laoyancheng.www.wxmarketbackend.service.MarketBrandService;
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
 * @Date: 2023/12/30 19:51
 */
@RestController
@RequestMapping("wx/brand")
public class WxBrandController {
    @Autowired
    private MarketBrandService brandService;
    @GetMapping("list")
    public Object list(){
        return ResponseUtil.ok(brandService.list());
    }

    @GetMapping("detail")
    public Object detail(@RequestParam("id") @Min(value = 1, message = "id must be a positive integer") Integer id){
        MarketBrand brand = brandService.selectBrandById(id);
        if(brand == null)
            return ResponseUtil.badArgumentValue();
        return ResponseUtil.ok(brand);
    }
}
