package com.laoyancheng.www.wxmarketbackend.service;

public interface MarketCategoryService {
    Object selectBroParentCategoriesByCategoryId(Integer id);

    Object index();

    Object listL1CategoryAndSubCategoriesByL1Id(Integer id);
}
