package com.jzx.o2o.service.impl;

import com.jzx.o2o.dao.ShopDao;
import com.jzx.o2o.dto.ShopExecution;
import com.jzx.o2o.entity.Shop;
import com.jzx.o2o.enums.ShopStateEnum;
import com.jzx.o2o.service.ShopService;
//import com.jzx.o2o.util.ImageUtil;
//import com.jzx.o2o.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import java.io.File;
import java.util.Date;

/**
 * @ClassName: ShopServiceImpl
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/7 0007下午 2:56
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    @Override
    //开启事物标签 表明方法受事物支持
    @Transactional
    public ShopExecution addShop(Shop shop) {
        //检查传入的shop是否合法
        if(shop==null){
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
            //后面还有一部分自己实现
        }
        try {
            //店铺状态初始化
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            //添加店铺信息
            int effecTedNum=shopDao.insertShop(shop);
            //判断插入数据是否成功
            if(effecTedNum<=0){
                throw new RuntimeException("店铺创建失败");
            }
//            else {
//                if(shopImg!=null){
//                    //存储图片
//                    try {
//                        addShopImg(shop,shopImg);
//                    }catch (Exception e){
//                        throw new RuntimeException("addShopImg error"+e.getMessage());
//                    }
//                    //更新店铺的图片地址
//                    effecTedNum=shopDao.updateShop(shop);
//                    if(effecTedNum<=0){
//                        throw new RuntimeException("更新图片地址失败");
//                    }
//                }
//            }
        }catch (Exception e){
            throw new RuntimeException("addShop error"+e.getMessage());
        }
        return null;
    }

//    private void addShopImg(Shop shop, File shopImg) {
//        //获取shop图片目录的相对值路径
//        String dest= PathUtil.getShopImagePath(shop.getShopId());
//       String shopImgAddr= ImageUtil.generateThumbnail(shopImg,dest);
//        shop.setShopImg(shopImgAddr);
//    }
}
