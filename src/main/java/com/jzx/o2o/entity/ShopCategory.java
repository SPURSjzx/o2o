package com.jzx.o2o.entity;

import java.util.Date;

/**
 * @ClassName: ShopCategory
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/7/31 0031上午 11:17
 */
//店铺类别实体类
public class ShopCategory {

    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    //图片链接地址
    private String shopCategoryImg;
    //权重
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    //上级ID
    private ShopCategory parent;


}
