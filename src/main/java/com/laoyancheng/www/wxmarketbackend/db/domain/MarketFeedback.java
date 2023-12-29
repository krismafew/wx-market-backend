package com.laoyancheng.www.wxmarketbackend.db.domain;

import java.util.Date;

public class MarketFeedback {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.username
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.mobile
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.feed_type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String feedType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.content
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.status
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.has_picture
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Boolean hasPicture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.pic_urls
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String[] picUrls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_feedback.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.id
     *
     * @return the value of market_feedback.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.id
     *
     * @param id the value for market_feedback.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.user_id
     *
     * @return the value of market_feedback.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.user_id
     *
     * @param userId the value for market_feedback.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.username
     *
     * @return the value of market_feedback.username
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.username
     *
     * @param username the value for market_feedback.username
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.mobile
     *
     * @return the value of market_feedback.mobile
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.mobile
     *
     * @param mobile the value for market_feedback.mobile
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.feed_type
     *
     * @return the value of market_feedback.feed_type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.feed_type
     *
     * @param feedType the value for market_feedback.feed_type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.content
     *
     * @return the value of market_feedback.content
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.content
     *
     * @param content the value for market_feedback.content
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.status
     *
     * @return the value of market_feedback.status
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.status
     *
     * @param status the value for market_feedback.status
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.has_picture
     *
     * @return the value of market_feedback.has_picture
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Boolean getHasPicture() {
        return hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.has_picture
     *
     * @param hasPicture the value for market_feedback.has_picture
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setHasPicture(Boolean hasPicture) {
        this.hasPicture = hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.pic_urls
     *
     * @return the value of market_feedback.pic_urls
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String[] getPicUrls() {
        return picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.pic_urls
     *
     * @param picUrls the value for market_feedback.pic_urls
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setPicUrls(String[] picUrls) {
        this.picUrls = picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.add_time
     *
     * @return the value of market_feedback.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.add_time
     *
     * @param addTime the value for market_feedback.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.update_time
     *
     * @return the value of market_feedback.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.update_time
     *
     * @param updateTime the value for market_feedback.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_feedback.deleted
     *
     * @return the value of market_feedback.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_feedback.deleted
     *
     * @param deleted the value for market_feedback.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table market_feedback
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table market_feedback
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_feedback
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_feedback
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_feedback
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_feedback
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public String getName() {
            return this.name;
        }
    }
}