package com.jzx.o2o.service;

import com.jzx.o2o.BaseTest;
import com.jzx.o2o.dto.ShopExecution;
import com.jzx.o2o.entity.Area;
import com.jzx.o2o.entity.PersonInfo;
import com.jzx.o2o.entity.Shop;
import com.jzx.o2o.entity.ShopCategory;
import com.jzx.o2o.enums.ShopStateEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import static org.junit.Assert.*;
import java.io.File;
import java.util.Date;

/**
 * @ClassName: ShopServiceTest
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/7 0007上午 10:39
 */
public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;

    @Test
    public void testAddShop() throws Exception{
        Shop shop=new Shop();
        PersonInfo owner=new PersonInfo();
        Area area=new Area();
        ShopCategory shopCategory=new ShopCategory();
        owner.setUserId(1L);
        area.setAreaId(2);
        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试店铺1");
        shop.setShopDesc("test1");
        shop.setShopAddr("test1");
        shop.setPhone("test1");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(ShopStateEnum.CHECK.getState());
        shop.setAdvice("审核中");
        File shopImg = new File("D:/资源/lpz1.jpg");
        ShopExecution se = shopService.addShop(shop);
        assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
    }
}
