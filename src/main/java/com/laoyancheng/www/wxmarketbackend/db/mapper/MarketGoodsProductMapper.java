package com.laoyancheng.www.wxmarketbackend.db.mapper;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGoodsProduct;
import com.laoyancheng.www.wxmarketbackend.db.domain.MarketGoodsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketGoodsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    long countByExample(MarketGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int deleteByExample(MarketGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int insert(MarketGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int insertSelective(MarketGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    MarketGoodsProduct selectOneByExample(MarketGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    List<MarketGoodsProduct> selectByExample(MarketGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    MarketGoodsProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByExampleSelective(@Param("record") MarketGoodsProduct record, @Param("example") MarketGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByExample(@Param("record") MarketGoodsProduct record, @Param("example") MarketGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByPrimaryKeySelective(MarketGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table market_goods_product
     *
     * @mbg.generated Thu Dec 28 23:26:32 CST 2023
     */
    int updateByPrimaryKey(MarketGoodsProduct record);
}