package com.jzx.o2o.entity;

import java.util.Date;

/**
 * @ClassName: Area
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/7/31 0031上午 9:15
 */
//区域实体类
public class Area {
    //ID
    public Integer areaId;
    //名称
    public String areaName;
    //权重 用来排序
    public Integer priority;
    //创建时间
    public Date createIime;
    //更新时间
    private Date lastEdiTtime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateIime() {
        return createIime;
    }

    public void setCreateIime(Date createIime) {
        this.createIime = createIime;
    }

    public Date getLastEdiTtime() {
        return lastEdiTtime;
    }

    public void setLastEdiTtime(Date lastEdiTtime) {
        this.lastEdiTtime = lastEdiTtime;
    }
}
