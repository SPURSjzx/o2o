package com.jzx.o2o.execptions;

import java.io.Serializable;

/**
 * 业务异常类 相当于对RuntimeException做了一层封装
 * @ClassName: ShopOperationException
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/7 0007上午 9:37
 */
public class ShopOperationException extends RuntimeException implements Serializable  {
    //生成序列化id
    private static final long serialVersionUID = 7117450433816996662L;

    public ShopOperationException(String msg){
        //super代表RuntimeException的构造函数
        super(msg);
    }
}
