package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGroupon;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGrouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketGrouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    long countByExample(MarketGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int deleteByExample(MarketGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int insert(MarketGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int insertSelective(MarketGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    MarketGroupon selectOneByExample(MarketGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    List<MarketGroupon> selectByExample(MarketGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    MarketGroupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketGroupon record, @Param("example") MarketGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByExample(@Param("record") MarketGroupon record, @Param("example") MarketGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByPrimaryKeySelective(MarketGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByPrimaryKey(MarketGroupon record);
}