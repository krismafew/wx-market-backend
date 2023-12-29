package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCouponUser;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCouponUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketCouponUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    long countByExample(MarketCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByExample(MarketCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insert(MarketCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insertSelective(MarketCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketCouponUser selectOneByExample(MarketCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    List<MarketCouponUser> selectByExample(MarketCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketCouponUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketCouponUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketCouponUser record, @Param("example") MarketCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExample(@Param("record") MarketCouponUser record, @Param("example") MarketCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKeySelective(MarketCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKey(MarketCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByExample(@Param("example") MarketCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_coupon_user
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByPrimaryKey(Integer id);
}