package com.jzx.o2o.dto;

import com.jzx.o2o.entity.Shop;

import java.util.List;

/**
 * @ClassName: ShopExecution
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/6 0006下午 4:54
 */
public class ShopExecution {
    //结果状态
    private int state;
    //状态标识
    private String stateInfo;
    //店铺数量
    private int count;
    //操作的shop(增删改查时使用)
    private Shop shop;
    //shop列表(查询店铺列表时使用)
    private List<Shop>shopList;

    public ShopExecution(){

    }
    //枚举类型参数
    public ShopExecution(ShopStateEnum stateEnum){
        this.state=stateEnum.getState();
        this.stateInfo=stateEnum.getStateInfo();
    }
}
