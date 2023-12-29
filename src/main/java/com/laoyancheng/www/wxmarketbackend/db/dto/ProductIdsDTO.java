package com.laoyancheng.www.wxmarketbackend.db.dto;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

/**
 * @Description: 用于接收修改购物车商品数量请求的productId数组
 * @Author: JuRan
 * @Date: 2023/12/29 15:45
 */
public class ProductIdsDTO {
    @NotEmpty(message = "productIds数组不能为空")
    private List<Integer> productIds;

    public List<Integer> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }
}
