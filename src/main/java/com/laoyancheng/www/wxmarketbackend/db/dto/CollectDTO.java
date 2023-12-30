package com.laoyancheng.www.wxmarketbackend.db.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 15:47
 */
public class CollectDTO {
    @NotNull
    @Min(value = 0, message = "type must be 0 or 1")
    private Byte type;
    @NotNull
    @Min(value = 1, message = "valueId must be a positive integer")
    private Integer valueId;

    public Byte getType() {
        return type;
    }

    public Integer getValueId() {
        return valueId;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }
}
