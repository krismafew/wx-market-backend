package com.laoyancheng.www.wxmarketbackend.db.domain;

import java.util.Date;

public class MarketGroupon {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.order_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.groupon_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Integer grouponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.rules_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Integer rulesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.share_url
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String shareUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.creator_user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Integer creatorUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.creator_user_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date creatorUserTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Short status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.add_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.update_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_groupon.deleted
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.id
     *
     * @return the value of market_groupon.id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.id
     *
     * @param id the value for market_groupon.id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.order_id
     *
     * @return the value of market_groupon.order_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.order_id
     *
     * @param orderId the value for market_groupon.order_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.groupon_id
     *
     * @return the value of market_groupon.groupon_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Integer getGrouponId() {
        return grouponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.groupon_id
     *
     * @param grouponId the value for market_groupon.groupon_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setGrouponId(Integer grouponId) {
        this.grouponId = grouponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.rules_id
     *
     * @return the value of market_groupon.rules_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Integer getRulesId() {
        return rulesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.rules_id
     *
     * @param rulesId the value for market_groupon.rules_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setRulesId(Integer rulesId) {
        this.rulesId = rulesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.user_id
     *
     * @return the value of market_groupon.user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.user_id
     *
     * @param userId the value for market_groupon.user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.share_url
     *
     * @return the value of market_groupon.share_url
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.share_url
     *
     * @param shareUrl the value for market_groupon.share_url
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.creator_user_id
     *
     * @return the value of market_groupon.creator_user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Integer getCreatorUserId() {
        return creatorUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.creator_user_id
     *
     * @param creatorUserId the value for market_groupon.creator_user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setCreatorUserId(Integer creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.creator_user_time
     *
     * @return the value of market_groupon.creator_user_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getCreatorUserTime() {
        return creatorUserTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.creator_user_time
     *
     * @param creatorUserTime the value for market_groupon.creator_user_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setCreatorUserTime(Date creatorUserTime) {
        this.creatorUserTime = creatorUserTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.status
     *
     * @return the value of market_groupon.status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.status
     *
     * @param status the value for market_groupon.status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.add_time
     *
     * @return the value of market_groupon.add_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.add_time
     *
     * @param addTime the value for market_groupon.add_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.update_time
     *
     * @return the value of market_groupon.update_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.update_time
     *
     * @param updateTime the value for market_groupon.update_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_groupon.deleted
     *
     * @return the value of market_groupon.deleted
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_groupon.deleted
     *
     * @param deleted the value for market_groupon.deleted
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}