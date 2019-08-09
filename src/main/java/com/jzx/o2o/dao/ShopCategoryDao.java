package com.jzx.o2o.dao;

import com.jzx.o2o.entity.ShopCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: ShopCategoryDao
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/8 0008下午 2:18
 */
public interface ShopCategoryDao {
    List<ShopCategory> queryShopCategory(
            @Param("shopCategoryCondition") ShopCategory shopCategoryCondition);
}
