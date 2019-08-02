package com.jzx.o2o.entity;

import java.util.Date;

/**
 * @ClassName: WechatAuth
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/7/31 0031上午 10:47
 */
//微信账号实体类
public class WechatAuth {

    //微信帐号ID
    private Long wechatAuthId;
    //作为微信账号与公众号绑定的唯一标识
    private String openId;
    private Date createTime;
    //与用户实体类做关联   与用户ID进行关联
    private PersonInfo personInfo;

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
