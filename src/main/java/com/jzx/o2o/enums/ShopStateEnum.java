package com.jzx.o2o.enums;

/**
 * @ClassName: ShopStateEnum
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/6 0006下午 5:00
 */


public enum ShopStateEnum {

    CHECK(0,"审核中"),OFFLINE(-1,"非法店铺"),SUCCESS(1,"操作成功"),
    PASS(2,"通过认证"),INNER_ERROR(-1001,"系统内部错误"),
    NULL_SHOPID(-1002,"ShopId为空"),NULL_SHOP(-1003,"shop信息为空");
    private int state;
    private String stateInfo;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    private ShopStateEnum(int state, String stateInfo){
        this.state=state;
        this.stateInfo=stateInfo;
    }
    /**
     *根据传入的state返回响应的enum值
     */
    public static ShopStateEnum stateOf(int state){
        for(ShopStateEnum sateEnum:values()){
            if(sateEnum.getState()==state){
                return sateEnum;
            }
        }
        return null;
    }
}
