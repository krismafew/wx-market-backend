package com.laoyancheng.www.wxmarketbackend.db.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 23:36
 */
@Data
public class CommentDTO {
    @NotBlank
    private String content;
    @NotNull
    private boolean hasPicture;
    private String[] picUrls;
    @NotNull
    @Min(value = 1, message = "star must be a positive integer")
    private Short star;
    @NotNull
    @Min(value = 0, message = "type must be 0 or 1")
    private Byte type;
    @NotNull
    @Min(value = 1, message = "valueId must be a positive integer")
    private Integer valueId;
}
