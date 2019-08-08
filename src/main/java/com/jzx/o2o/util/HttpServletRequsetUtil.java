package com.jzx.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: HttpServletRequsetUtil
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/7 0007下午 4:23
 */
public class HttpServletRequsetUtil {
    //request参数中可能有参数需要转化为整型    根据request有各种类型的key 可以根据key取出不同的值来进行转化
    public static int getInt(HttpServletRequest request,String key){
        try {
            //          转化为整型          根据key取值
            return Integer.decode(request.getParameter(key));
        }catch (Exception e){
            //返回-1时转换失败
            return -1;
        }
    }
    //long
    public static long getLong(HttpServletRequest request,String key){
        try {
            //          转化为long          根据key取值
            return Long.valueOf(request.getParameter(key));
        }catch (Exception e){
            //返回-1时转换失败
            return -1;
        }
    }
    //Double
    public static Double getDouble(HttpServletRequest request,String key){
        try {
            //          转化为long          根据key取值
            return Double.valueOf(request.getParameter(key));
        }catch (Exception e){
            //返回-1时转换失败
            return -1d;
        }
    }
    //boolean
    public static boolean getBoolean(HttpServletRequest request,String key){
        try {
            //          转化为long          根据key取值
            return Boolean.valueOf(request.getParameter(key));
        }catch (Exception e){
            //返回-1时转换失败
            return false;
        }
    }
    //将request中对应的值转换为string类型
    public static String getSpring(HttpServletRequest request,String key){
        try {
            String result=request.getParameter(key);
            if(result!=null){
                //去掉两侧空格
                result=result.trim();
            }
            //如果为空
            if("".equals(result)){
                result=null;
            }
            return result;
        }catch (Exception e){
            return null;
        }
    }
}
