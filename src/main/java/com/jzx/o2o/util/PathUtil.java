//package com.jzx.o2o.util;
//
///**
// * 本工具类有两个作用
// *  1、返回项目图片的跟路径
// *  2、根据业务需求的不同，返回项目图片的子路径
// * @ClassName: PathUtil
// * @Description: TODO
// * @Author: Jzxxxxx
// * @Date: Created in 2019/8/6 0006下午 3:56
// */
//public class PathUtil {
//    //获取本系统中文件路径  并且对\进行替换
//    private static String seperator=System.getProperty("file.seperator");
//
//    public static String getImgBasePath(){
//        String os=System.getProperty("os.name");
//        String basePath="";
////        判断是什么操作系统
//        if(os.toLowerCase().startsWith("win")){
//            basePath="D:/资源/image";
//        }else {
//            basePath = "D:/资源/图片";
//        }
//        basePath=basePath.replace("/",seperator);
//        return basePath;
//    }
//    public static String getShopImagePath(long shopId){
//        String imagePath="/upload/item/shop/"+shopId+"/";
//        return imagePath.replace("/",seperator);
//    }
//}
