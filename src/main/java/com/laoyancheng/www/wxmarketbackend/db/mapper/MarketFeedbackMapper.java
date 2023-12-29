package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketFeedback;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketFeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    long countByExample(MarketFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByExample(MarketFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insert(MarketFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int insertSelective(MarketFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketFeedback selectOneByExample(MarketFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    List<MarketFeedback> selectByExample(MarketFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketFeedback selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    MarketFeedback selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketFeedback record, @Param("example") MarketFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByExample(@Param("record") MarketFeedback record, @Param("example") MarketFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKeySelective(MarketFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int updateByPrimaryKey(MarketFeedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByExample(@Param("example") MarketFeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_feedback
     *
     * @mbg.generated Fri Dec 29 16:04:46 CST 2023
     */
    int logicalDeleteByPrimaryKey(Integer id);
}