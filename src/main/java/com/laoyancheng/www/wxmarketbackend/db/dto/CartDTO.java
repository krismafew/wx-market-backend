package com.laoyancheng.www.wxmarketbackend.db.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 15:21
 */
public class CartDTO {
    @Min(value = 1, message = "goodsId must be a positive integer")
    @NotNull
    private Integer goodsId;
    @Min(value = 1, message = "id must be a positive integer")
    @NotNull
    private Integer id;
    @Min(value = 1, message = "number must be a positive integer")
    @NotNull
    private Short number;
    @Min(value = 1, message = "productId must be a positive integer")
    @NotNull
    private Integer productId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public Integer getId() {
        return id;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
