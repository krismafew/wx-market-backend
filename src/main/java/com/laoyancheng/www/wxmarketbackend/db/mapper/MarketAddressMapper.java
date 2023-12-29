package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddress;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    long countByExample(MarketAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByExample(MarketAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insert(MarketAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insertSelective(MarketAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketAddress selectOneByExample(MarketAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    List<MarketAddress> selectByExample(MarketAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketAddress selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketAddress record, @Param("example") MarketAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExample(@Param("record") MarketAddress record, @Param("example") MarketAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKeySelective(MarketAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKey(MarketAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByExample(@Param("example") MarketAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_address
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByPrimaryKey(Integer id);
}