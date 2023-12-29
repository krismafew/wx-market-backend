package com.laoyancheng.www.wxmarketbackend.db.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 17:17
 */
public class AddCartDTO {
    @Min(value = 1, message = "goodsId must be a positive integer")
    @NotNull
    private Integer goodsId;
    @Min(value = 1, message = "number must be a positive integer")
    @NotNull
    private Short number;
    @Min(value = 1, message = "productId must be a positive integer")
    @NotNull
    private Integer productId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public Short getNumber() {
        return number;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
