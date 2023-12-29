package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCategory;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    long countByExample(MarketCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByExample(MarketCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insert(MarketCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insertSelective(MarketCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketCategory selectOneByExample(MarketCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    List<MarketCategory> selectByExample(MarketCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketCategory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketCategory record, @Param("example") MarketCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExample(@Param("record") MarketCategory record, @Param("example") MarketCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKeySelective(MarketCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKey(MarketCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByExample(@Param("example") MarketCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_category
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByPrimaryKey(Integer id);
}