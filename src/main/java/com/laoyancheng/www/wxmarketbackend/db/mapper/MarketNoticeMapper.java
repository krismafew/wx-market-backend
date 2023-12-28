package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketNotice;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    long countByExample(MarketNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int deleteByExample(MarketNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int insert(MarketNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int insertSelective(MarketNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    MarketNotice selectOneByExample(MarketNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    List<MarketNotice> selectByExample(MarketNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    MarketNotice selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketNotice record, @Param("example") MarketNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByExample(@Param("record") MarketNotice record, @Param("example") MarketNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByPrimaryKeySelective(MarketNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_notice
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByPrimaryKey(MarketNotice record);
}