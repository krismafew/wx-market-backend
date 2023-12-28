package com.laoyancheng.www.wxmarketbackend.db.domain;

import java.math.BigDecimal;
import java.util.Date;

public class MarketOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.order_sn
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.order_status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Short orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.aftersale_status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Short aftersaleStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.consignee
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String consignee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.mobile
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.address
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.message
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.goods_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private BigDecimal goodsPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.freight_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private BigDecimal freightPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.coupon_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private BigDecimal couponPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.integral_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private BigDecimal integralPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.groupon_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private BigDecimal grouponPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.order_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private BigDecimal orderPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.actual_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private BigDecimal actualPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.pay_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String payId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.pay_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.ship_sn
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String shipSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.ship_channel
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String shipChannel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.ship_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date shipTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.refund_amount
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private BigDecimal refundAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.refund_type
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String refundType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.refund_content
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private String refundContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.refund_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date refundTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.confirm_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date confirmTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.comments
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Short comments;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.end_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.add_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.update_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column market_order.deleted
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.id
     *
     * @return the value of market_order.id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.id
     *
     * @param id the value for market_order.id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.user_id
     *
     * @return the value of market_order.user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.user_id
     *
     * @param userId the value for market_order.user_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.order_sn
     *
     * @return the value of market_order.order_sn
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.order_sn
     *
     * @param orderSn the value for market_order.order_sn
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.order_status
     *
     * @return the value of market_order.order_status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Short getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.order_status
     *
     * @param orderStatus the value for market_order.order_status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.aftersale_status
     *
     * @return the value of market_order.aftersale_status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Short getAftersaleStatus() {
        return aftersaleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.aftersale_status
     *
     * @param aftersaleStatus the value for market_order.aftersale_status
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setAftersaleStatus(Short aftersaleStatus) {
        this.aftersaleStatus = aftersaleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.consignee
     *
     * @return the value of market_order.consignee
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.consignee
     *
     * @param consignee the value for market_order.consignee
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.mobile
     *
     * @return the value of market_order.mobile
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.mobile
     *
     * @param mobile the value for market_order.mobile
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.address
     *
     * @return the value of market_order.address
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.address
     *
     * @param address the value for market_order.address
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.message
     *
     * @return the value of market_order.message
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.message
     *
     * @param message the value for market_order.message
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.goods_price
     *
     * @return the value of market_order.goods_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.goods_price
     *
     * @param goodsPrice the value for market_order.goods_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.freight_price
     *
     * @return the value of market_order.freight_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.freight_price
     *
     * @param freightPrice the value for market_order.freight_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.coupon_price
     *
     * @return the value of market_order.coupon_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.coupon_price
     *
     * @param couponPrice the value for market_order.coupon_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.integral_price
     *
     * @return the value of market_order.integral_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public BigDecimal getIntegralPrice() {
        return integralPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.integral_price
     *
     * @param integralPrice the value for market_order.integral_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setIntegralPrice(BigDecimal integralPrice) {
        this.integralPrice = integralPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.groupon_price
     *
     * @return the value of market_order.groupon_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public BigDecimal getGrouponPrice() {
        return grouponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.groupon_price
     *
     * @param grouponPrice the value for market_order.groupon_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setGrouponPrice(BigDecimal grouponPrice) {
        this.grouponPrice = grouponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.order_price
     *
     * @return the value of market_order.order_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.order_price
     *
     * @param orderPrice the value for market_order.order_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.actual_price
     *
     * @return the value of market_order.actual_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.actual_price
     *
     * @param actualPrice the value for market_order.actual_price
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.pay_id
     *
     * @return the value of market_order.pay_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.pay_id
     *
     * @param payId the value for market_order.pay_id
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setPayId(String payId) {
        this.payId = payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.pay_time
     *
     * @return the value of market_order.pay_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.pay_time
     *
     * @param payTime the value for market_order.pay_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.ship_sn
     *
     * @return the value of market_order.ship_sn
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getShipSn() {
        return shipSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.ship_sn
     *
     * @param shipSn the value for market_order.ship_sn
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setShipSn(String shipSn) {
        this.shipSn = shipSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.ship_channel
     *
     * @return the value of market_order.ship_channel
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getShipChannel() {
        return shipChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.ship_channel
     *
     * @param shipChannel the value for market_order.ship_channel
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setShipChannel(String shipChannel) {
        this.shipChannel = shipChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.ship_time
     *
     * @return the value of market_order.ship_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getShipTime() {
        return shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.ship_time
     *
     * @param shipTime the value for market_order.ship_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.refund_amount
     *
     * @return the value of market_order.refund_amount
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.refund_amount
     *
     * @param refundAmount the value for market_order.refund_amount
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.refund_type
     *
     * @return the value of market_order.refund_type
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.refund_type
     *
     * @param refundType the value for market_order.refund_type
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.refund_content
     *
     * @return the value of market_order.refund_content
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public String getRefundContent() {
        return refundContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.refund_content
     *
     * @param refundContent the value for market_order.refund_content
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setRefundContent(String refundContent) {
        this.refundContent = refundContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.refund_time
     *
     * @return the value of market_order.refund_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.refund_time
     *
     * @param refundTime the value for market_order.refund_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.confirm_time
     *
     * @return the value of market_order.confirm_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getConfirmTime() {
        return confirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.confirm_time
     *
     * @param confirmTime the value for market_order.confirm_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.comments
     *
     * @return the value of market_order.comments
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Short getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.comments
     *
     * @param comments the value for market_order.comments
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setComments(Short comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.end_time
     *
     * @return the value of market_order.end_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.end_time
     *
     * @param endTime the value for market_order.end_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.add_time
     *
     * @return the value of market_order.add_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.add_time
     *
     * @param addTime the value for market_order.add_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.update_time
     *
     * @return the value of market_order.update_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.update_time
     *
     * @param updateTime the value for market_order.update_time
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column market_order.deleted
     *
     * @return the value of market_order.deleted
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column market_order.deleted
     *
     * @param deleted the value for market_order.deleted
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}