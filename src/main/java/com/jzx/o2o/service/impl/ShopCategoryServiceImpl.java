package com.jzx.o2o.service.impl;

import com.jzx.o2o.entity.ShopCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ShopCategoryServiceImpl
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/8 0008下午 4:32
 */
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Autowired
    private ShopCategoryService shopCategoryService;
    @Override
    public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) {
        return shopCategoryService.getShopCategoryList(shopCategoryCondition);
    }
}
