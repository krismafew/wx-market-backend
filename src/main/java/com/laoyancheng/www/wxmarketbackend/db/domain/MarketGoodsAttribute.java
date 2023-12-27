package com.laoyancheng.www.wxmarketbackend.db.domain;

import java.util.Date;

public class MarketGoodsAttribute {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_goods_attribute.id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_goods_attribute.goods_id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_goods_attribute.attribute
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private String attribute;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_goods_attribute.value
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_goods_attribute.add_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_goods_attribute.update_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_goods_attribute.deleted
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_goods_attribute.id
     *
     * @return the value of market_goods_attribute.id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_goods_attribute.id
     *
     * @param id the value for market_goods_attribute.id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_goods_attribute.goods_id
     *
     * @return the value of market_goods_attribute.goods_id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_goods_attribute.goods_id
     *
     * @param goodsId the value for market_goods_attribute.goods_id
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_goods_attribute.attribute
     *
     * @return the value of market_goods_attribute.attribute
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_goods_attribute.attribute
     *
     * @param attribute the value for market_goods_attribute.attribute
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_goods_attribute.value
     *
     * @return the value of market_goods_attribute.value
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_goods_attribute.value
     *
     * @param value the value for market_goods_attribute.value
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_goods_attribute.add_time
     *
     * @return the value of market_goods_attribute.add_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_goods_attribute.add_time
     *
     * @param addTime the value for market_goods_attribute.add_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_goods_attribute.update_time
     *
     * @return the value of market_goods_attribute.update_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_goods_attribute.update_time
     *
     * @param updateTime the value for market_goods_attribute.update_time
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_goods_attribute.deleted
     *
     * @return the value of market_goods_attribute.deleted
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_goods_attribute.deleted
     *
     * @param deleted the value for market_goods_attribute.deleted
     *
     * @mbg.generated Wed Dec 27 20:04:49 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}