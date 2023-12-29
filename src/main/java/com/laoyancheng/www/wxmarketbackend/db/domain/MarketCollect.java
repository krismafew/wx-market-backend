package com.laoyancheng.www.wxmarketbackend.db.domain;

import java.util.Date;

public class MarketCollect {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_collect
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table market_collect
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_collect.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_collect.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_collect.value_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Integer valueId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_collect.type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_collect.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_collect.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_collect.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_collect.id
     *
     * @return the value of market_collect.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_collect.id
     *
     * @param id the value for market_collect.id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_collect.user_id
     *
     * @return the value of market_collect.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_collect.user_id
     *
     * @param userId the value for market_collect.user_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_collect.value_id
     *
     * @return the value of market_collect.value_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Integer getValueId() {
        return valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_collect.value_id
     *
     * @param valueId the value for market_collect.value_id
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_collect.type
     *
     * @return the value of market_collect.type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_collect.type
     *
     * @param type the value for market_collect.type
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_collect.add_time
     *
     * @return the value of market_collect.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_collect.add_time
     *
     * @param addTime the value for market_collect.add_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_collect.update_time
     *
     * @return the value of market_collect.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_collect.update_time
     *
     * @param updateTime the value for market_collect.update_time
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_collect
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_collect.deleted
     *
     * @return the value of market_collect.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_collect.deleted
     *
     * @param deleted the value for market_collect.deleted
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table market_collect
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    public enum Deleted {
        NOT_DELETED(new Boolean("0"), "未删除"),
        IS_DELETED(new Boolean("1"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table market_collect
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        private final Boolean value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table market_collect
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_collect
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        Deleted(Boolean value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_collect
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public Boolean getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_collect
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public Boolean value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table market_collect
         *
         * @mbg.generated Fri Dec 29 16:04:46 CST 2023
         */
        public String getName() {
            return this.name;
        }
    }
}