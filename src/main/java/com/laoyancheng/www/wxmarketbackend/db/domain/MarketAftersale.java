package com.laoyancheng.www.wxmarketbackend.db.domain;

import java.math.BigDecimal;
import java.util.Date;

public class MarketAftersale {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.aftersale_sn
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String aftersaleSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.order_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Short type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.reason
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.amount
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.pictures
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String[] pictures;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.comment
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.status
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Short status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.handle_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Date handleTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_aftersale.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.id
     *
     * @return the value of market_aftersale.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.id
     *
     * @param id the value for market_aftersale.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.aftersale_sn
     *
     * @return the value of market_aftersale.aftersale_sn
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String getAftersaleSn() {
        return aftersaleSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.aftersale_sn
     *
     * @param aftersaleSn the value for market_aftersale.aftersale_sn
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setAftersaleSn(String aftersaleSn) {
        this.aftersaleSn = aftersaleSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.order_id
     *
     * @return the value of market_aftersale.order_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.order_id
     *
     * @param orderId the value for market_aftersale.order_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.user_id
     *
     * @return the value of market_aftersale.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.user_id
     *
     * @param userId the value for market_aftersale.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.type
     *
     * @return the value of market_aftersale.type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.type
     *
     * @param type the value for market_aftersale.type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.reason
     *
     * @return the value of market_aftersale.reason
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.reason
     *
     * @param reason the value for market_aftersale.reason
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.amount
     *
     * @return the value of market_aftersale.amount
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.amount
     *
     * @param amount the value for market_aftersale.amount
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.pictures
     *
     * @return the value of market_aftersale.pictures
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String[] getPictures() {
        return pictures;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.pictures
     *
     * @param pictures the value for market_aftersale.pictures
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setPictures(String[] pictures) {
        this.pictures = pictures;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.comment
     *
     * @return the value of market_aftersale.comment
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.comment
     *
     * @param comment the value for market_aftersale.comment
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.status
     *
     * @return the value of market_aftersale.status
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.status
     *
     * @param status the value for market_aftersale.status
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.handle_time
     *
     * @return the value of market_aftersale.handle_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.handle_time
     *
     * @param handleTime the value for market_aftersale.handle_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.add_time
     *
     * @return the value of market_aftersale.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.add_time
     *
     * @param addTime the value for market_aftersale.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.update_time
     *
     * @return the value of market_aftersale.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.update_time
     *
     * @param updateTime the value for market_aftersale.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_aftersale.deleted
     *
     * @return the value of market_aftersale.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_aftersale.deleted
     *
     * @param deleted the value for market_aftersale.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table market_aftersale
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table market_aftersale
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_aftersale
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_aftersale
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_aftersale
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_aftersale
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public String getName() {
            return this.name;
        }
    }
}