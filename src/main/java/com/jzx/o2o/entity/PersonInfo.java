package com.jzx.o2o.entity;

import java.util.Date;

/**
 * @ClassName: PersonInfo
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/7/31 0031上午 9:36
 */
//用户信息实体类
public class PersonInfo {

    private Long userId;
    private String name;
    //用户的头像地址
    private String profileImg;
    //邮箱
    private String email;
    //性别
    private String gender;
    //用户状态
    private Integer enableStatus;
    //身份标识  1=顾客 2=店家 3=超级管理员
    private Integer userType;
    //创建时间
    private Date creatrTime;
    //上次操作时间
    private Date lastEditTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreatrTime() {
        return creatrTime;
    }

    public void setCreatrTime(Date creatrTime) {
        this.creatrTime = creatrTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
