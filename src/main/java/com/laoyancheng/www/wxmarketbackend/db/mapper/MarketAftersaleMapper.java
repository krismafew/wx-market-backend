package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAftersale;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAftersaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketAftersaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    long countByExample(MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByExample(MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insert(MarketAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insertSelective(MarketAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketAftersale selectOneByExample(MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    List<MarketAftersale> selectByExample(MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketAftersale selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketAftersale selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketAftersale record, @Param("example") MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExample(@Param("record") MarketAftersale record, @Param("example") MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKeySelective(MarketAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKey(MarketAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByExample(@Param("example") MarketAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_aftersale
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByPrimaryKey(Integer id);
}