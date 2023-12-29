package com.laoyancheng.www.wxmarketbackend.db.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 20:45
 */
public class CartCheckDTO {
    @NotNull
    @Min(value = 0, message = "isChecked must be a integer ")
    private Short isChecked;
    @NotEmpty
    private List<Integer> productIds;

    public Short getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Short isChecked) {
        this.isChecked = isChecked;
    }

    public List<Integer> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }
}
