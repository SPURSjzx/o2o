package com.jzx.o2o.dao;

import com.jzx.o2o.BaseTest;
import com.jzx.o2o.entity.Area;
import com.jzx.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;
import java.util.List;

/**
 * @ClassName: ShopCategoryDaoTest
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/8 0008下午 2:53
 */
public class ShopCategoryDaoTest extends BaseTest {
    @Autowired
    private ShopCategoryDao shopCategoryDao;
    @Test
    public void testQueryShopCategory(){
        List<ShopCategory>shopCategoryList=shopCategoryDao.queryShopCategory(new ShopCategory());
        assertEquals(2,shopCategoryList.size());
        ShopCategory testCategory=new ShopCategory();
        ShopCategory parentCategory=new ShopCategory();
        parentCategory.setShopCategoryId(1L);
        testCategory.setParent(parentCategory);
        shopCategoryList=shopCategoryDao.queryShopCategory(testCategory);
        //assertEquals(1,shopCategoryList.size());
        System.out.println(shopCategoryList.get(0 ).getShopCategoryName());
    }
}
