package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketTopic;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    long countByExample(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByExample(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insert(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insertSelective(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketTopic selectOneByExample(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketTopic selectOneByExampleWithBLOBs(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    List<MarketTopic> selectByExampleWithBLOBs(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    List<MarketTopic> selectByExample(MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketTopic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketTopic selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketTopic record, @Param("example") MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") MarketTopic record, @Param("example") MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExample(@Param("record") MarketTopic record, @Param("example") MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKeySelective(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKey(MarketTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByExample(@Param("example") MarketTopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_topic
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByPrimaryKey(Integer id);
}