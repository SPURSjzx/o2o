package com.jzx.o2o.entity;


import java.util.Date;
import java.util.List;

/**
 * @ClassName: Product
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/7/31 0031下午 2:40
 */
//商品实体类
public class Product {

    private Long productId;
    private String productName;
    //商品描述
    private String productDesc;
    //商品简略图地址
    private String imgAddr;
    //商品价格 原价 折扣价
    private String normalPrice;
    private String promotionPrice;
    private Integer priority;
    private Date creatTime;
    private Date lastEditTime;
    //0=下架 1=在前端展示  商品状态
    private Integer enableStatus;
    //商品详情列表
    private List<ProductImg> productImgList;
    //商品类别
    private ProductCateGory productCateGory;
    //商品所在店铺
    private Shop shop;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getImgAddr() {
        return imgAddr;
    }

    public void setImgAddr(String imgAddr) {
        this.imgAddr = imgAddr;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(String promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public List<ProductImg> getProductImgList() {
        return productImgList;
    }

    public void setProductImgList(List<ProductImg> productImgList) {
        this.productImgList = productImgList;
    }

    public ProductCateGory getProductCateGory() {
        return productCateGory;
    }

    public void setProductCateGory(ProductCateGory productCateGory) {
        this.productCateGory = productCateGory;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
