package com.jzx.o2o.service.impl;

import com.jzx.o2o.entity.Area;
import com.jzx.o2o.entity.ShopCategory;

import java.util.List;

/**
 * @ClassName: ShopCategoryService
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/8 0008下午 4:30
 */
public interface ShopCategoryService {
    List<ShopCategory>getShopCategoryList(ShopCategory shopCategoryCondition);

}
