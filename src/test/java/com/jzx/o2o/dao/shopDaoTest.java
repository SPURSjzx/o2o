package com.jzx.o2o.dao;

import static org.junit.Assert.*;

import com.jzx.o2o.BaseTest;
import com.jzx.o2o.entity.Area;
import com.jzx.o2o.entity.PersonInfo;
import com.jzx.o2o.entity.Shop;
import com.jzx.o2o.entity.ShopCategory;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @ClassName: shopDaoTest
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/6 0006上午 9:20
 */
public class shopDaoTest extends BaseTest {

    @Autowired
    private ShopDao shopDao;
    @Test
    //@Ignore这个测试方法将被忽略，不被执行。

    public void testInsertShop(){
       Shop shop=new Shop();
       shop.setShopId(1L);
       PersonInfo owner=new PersonInfo();
       Area area=new Area();
       ShopCategory shopCategory=new ShopCategory();
       owner.setUserId(1L);
       area.setAreaId(2);
       shopCategory.setShopCategoryId(1L);
       shop.setOwner(owner);
       shop.setArea(area);
       shop.setShopCategory(shopCategory);
       shop.setShopName("测试店铺");
       shop.setShopDesc("test");
       shop.setShopAddr("test");
       shop.setPhone("test");
       shop.setShopImg("test");
       shop.setCreateTime(new Date());
       shop.setPriority(1);
       shop.setEnableStatus(1);
       shop.setAdvice("审核中");
       //返回一个结果
       int effectedNum=shopDao.insertShop(shop);
       assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void testupdateShop(){
        Shop shop=new Shop();
        shop.setShopId(1L);
        shop.setShopDesc("测试描述");
        shop.setShopAddr("测试地址");
        shop.setLastEditTime(new Date());
        //返回一个结果
        int effectedNum=shopDao.updateShop(shop);
        assertEquals(1,effectedNum);
    }
}
