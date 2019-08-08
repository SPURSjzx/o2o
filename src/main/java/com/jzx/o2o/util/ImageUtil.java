//package com.jzx.o2o.util;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;
//
//import ch.qos.logback.core.util.FileUtil;
//import net.coobird.thumbnailator.Thumbnails;
//
//import net.coobird.thumbnailator.geometry.Positions;
//import org.springframework.web.multipart.commons.CommonsMultipartFile;
//
//import javax.imageio.ImageIO;
//import java.util.Date;
//import java.util.Random;
//
///**
// * 图片处理工具类
// * @ClassName: ImageUtil
// * @Description: TODO
// * @Author: Jzxxxxx
// * @Date: Created in 2019/8/6 0006下午 3:02
// */
//public class ImageUtil {
//    //设置时间格式
//    private static final SimpleDateFormat sDataFormt=new SimpleDateFormat("yyyyMMddHHmmss");
//    private static final Random r=new Random();
//    //处理略缩图
//    public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr){
//        String realFileName= getRandomFileName();
//        String extension=getFileExtension(thumbnail);
//        makeDirPath(targetAddr);
//        String relativeAddr=targetAddr+realFileName+extension;
//        File dest=new File(PathUtil.getImgBasePath()+relativeAddr);
//        try {
//            Thumbnails.of(thumbnail.getInputStream()).size(200,200)
//                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("/D:/o2o/src/main/resources/2017060420322333745.jpg")),0.25f)
//                    .outputQuality(0.8f).toFile(dest);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        return relativeAddr;
//    }
//
//    /**
//     * 创建目标路径所涉及到的目录，即/home/work/jzx/xxx.jpg
//     * 那么home work jzx这是三个文件夹都得自动创建
//     * @param targetAddr
//     */
//    private static void makeDirPath(String targetAddr) {
//        String realFileParentPath=PathUtil.getImgBasePath()+targetAddr;
//        File dirPath=new File(realFileParentPath);
//        if(!dirPath.exists()){
//             dirPath.mkdirs();
//        }
//    }
//
//    /**
//     * 获取输入文件流的拓展名
//     * @param
//     * @return
//     */
//    private static String getFileExtension(CommonsMultipartFile cFile) {
//        String originalFileName=cFile.getOriginalFilename();
//        return originalFileName.substring(originalFileName.lastIndexOf("."));
//    }
//
//    //实现getRandomFileName 生成随机且不同的文件名 当前年月日分钟秒钟+五位随机数
//    private static String getRandomFileName(){
//        //获取五位随机数
//        int rannum=r.nextInt(89999)+10000;
//        String nowTimeStr=sDataFormt.format(new Date());
//        return nowTimeStr+rannum;
//    }
//
//
//    public static void main(String[] args) throws IOException {
//        //通过线程逆推到类加载器获得水印图片的路径 idea编译了classes文件 好像不能使用这个方法
////        String basePath=Thread.currentThread().getContextClassLoader().getResource("").getPath();
////        System.out.println(basePath);
//        //引入Thumbnailator的主类
//        //of方法传入相关需要处理的文件 比如图片流或者本地文件等
//        Thumbnails.of(new File("D:/资源/lpz.jpg"))
//        //指定输出图片的大小
//        .size(200,200)
//        //给输出的图片添加水印 需要指定水印位置  指定水印图片的路径  定义水印透明度
//        .watermark(Positions.BOTTOM_RIGHT,
//                ImageIO.read(new File("/D:/o2o/src/main/resources/2017060420322333745.jpg")),0.25f).
//                //图片压缩
//                outputQuality(0.8f).toFile("D:/资源/lpz1.jpg");
//    }
//}
