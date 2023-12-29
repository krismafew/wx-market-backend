package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGrouponRules;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGrouponRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketGrouponRulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    long countByExample(MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByExample(MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insert(MarketGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insertSelective(MarketGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketGrouponRules selectOneByExample(MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    List<MarketGrouponRules> selectByExample(MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketGrouponRules selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketGrouponRules record, @Param("example") MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExample(@Param("record") MarketGrouponRules record, @Param("example") MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKeySelective(MarketGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKey(MarketGrouponRules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByExample(@Param("example") MarketGrouponRulesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_groupon_rules
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByPrimaryKey(Integer id);
}