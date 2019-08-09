package com.jzx.o2o.service;

import com.jzx.o2o.entity.Area;
import com.jzx.o2o.entity.ShopCategory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ShopCategoryService
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/8 0008下午 4:30
 */
@Service
public interface ShopCategoryService {
    List<ShopCategory>getShopCategoryList(ShopCategory shopCategoryCondition);

}
