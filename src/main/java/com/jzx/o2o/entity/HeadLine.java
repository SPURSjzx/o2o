package com.jzx.o2o.entity;


import java.lang.ref.SoftReference;
import java.util.Date;

/**
 * @ClassName: HeadLine
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/7/31 0031上午 11:09
 */
//头条实体类
public class HeadLine {

    private Long lineId;
    private String lineName;
    //链接 点击头条图片会跳转
    private String lineLink;
    private String lineImg;
    //头条权重 优先级
    private Integer priority;
    //属性 0不可用 1可用
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineLink() {
        return lineLink;
    }

    public void setLineLink(String lineLink) {
        this.lineLink = lineLink;
    }

    public String getLineImg() {
        return lineImg;
    }

    public void setLineImg(String lineImg) {
        this.lineImg = lineImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
