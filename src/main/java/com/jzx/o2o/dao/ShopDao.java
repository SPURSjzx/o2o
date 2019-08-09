package com.jzx.o2o.dao;

import com.jzx.o2o.entity.Shop;

/**
 * @ClassName: ShopDao
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/2 0002下午 4:47
 */
public interface ShopDao{

    /**
     * 根据店铺id查询店铺信息
     */
    Shop queryByShopId(long shopId);
    /**
     * 返回一个int类型的数据 1代表店铺新增成功  -1代表失败
     * 新增店铺接口
     * @param shop
     * @return
     */
    Integer insertShop(Shop shop);

    /**
     * 更新店铺信息
     * @param shop
     * @return
     */
    Integer updateShop(Shop shop);
}
