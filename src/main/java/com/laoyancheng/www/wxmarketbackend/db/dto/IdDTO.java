package com.laoyancheng.www.wxmarketbackend.db.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 19:30
 */
public class IdDTO {
    @NotNull
    @Min(value = 1, message = "id must be a positive integer")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
