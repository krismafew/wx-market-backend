package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketRegion;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    long countByExample(MarketRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int deleteByExample(MarketRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int insert(MarketRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int insertSelective(MarketRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    MarketRegion selectOneByExample(MarketRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    List<MarketRegion> selectByExample(MarketRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    MarketRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketRegion record, @Param("example") MarketRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByExample(@Param("record") MarketRegion record, @Param("example") MarketRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByPrimaryKeySelective(MarketRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_region
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByPrimaryKey(MarketRegion record);
}