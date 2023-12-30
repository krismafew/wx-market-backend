package com.laoyancheng.www.wxmarketbackend.db.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 16:36
 */
public class AddressDTO {
    @NotBlank
    private String addressDetail;
    @NotBlank
    private String areaCode;
    @NotBlank
    private String city;
    @NotBlank
    private String county;
    @NotNull
    @Min(value = 0, message = "id must be a non-negative integer")
    private Integer id;
    @NotNull
    private boolean isDefault;
    @NotBlank
    private String name;
    @NotBlank
    private String province;
    @NotBlank
    private String tel;

    public String getAddressDetail() {
        return addressDetail;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public Integer getId() {
        return id;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    public String getTel() {
        return tel;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
