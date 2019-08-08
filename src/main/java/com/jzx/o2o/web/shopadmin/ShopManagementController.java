package com.jzx.o2o.web.shopadmin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jzx.o2o.dto.ShopExecution;
import com.jzx.o2o.entity.Area;
import com.jzx.o2o.entity.PersonInfo;
import com.jzx.o2o.entity.Shop;
import com.jzx.o2o.entity.ShopCategory;
import com.jzx.o2o.enums.ShopStateEnum;
import com.jzx.o2o.service.AreaService;
import com.jzx.o2o.service.ShopService;
import com.jzx.o2o.service.impl.ShopCategoryService;
import com.jzx.o2o.util.HttpServletRequsetUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: ShopManagementController
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/7 0007下午 4:15
 */
@Controller
@RequestMapping("/shopadmin")
public class ShopManagementController {
    @Autowired
    private ShopService shopService;
    @Autowired
    private ShopCategoryService shopCategoryService;
    @Autowired
    private AreaService areaService;
    @RequestMapping(value = "/getshopinitinfo",method = RequestMethod.GET)
    @ResponseBody
    private Map<String,Object>getShopInitInfo(){
        Map<String,Object>modelMap=new HashMap<String,Object>();
        List<ShopCategory>shopCategoryList=new ArrayList<ShopCategory>();
        List<Area>areaList=new ArrayList<Area>();
        try{
            shopCategoryList=shopCategoryService.getShopCategoryList(new ShopCategory());
            areaList=areaService.getAreaList();
            modelMap.put("shopCategoryList",shopCategoryList);
            modelMap.put("areaList",areaList);
            modelMap.put("success",true);
        }catch (Exception e){
            modelMap.put("success",false);
            modelMap.put("errMsg",e.getMessage());
        }
        return modelMap;
    }
    //客户端的请求
    @RequestMapping(value = "/registershop",method = RequestMethod.POST)
    //将返回的map对象转换为json对象
    @ResponseBody
    private Map<String,Object>registerShop(HttpServletRequest request){
        //定义返回值
        Map<String,Object>modelMap=new HashMap<String,Object>();
        //开始具体功能编写需要定义一个工具类来解析request参数HttpServletRequsetUtil
        //1 接收并转换相应的参数 包括店铺信息图片信息等
        // 将前端传过来的shop相关的字符串转换为shop实体类
        String shopStr=HttpServletRequsetUtil.getSpring(request,"shopStr");
        ObjectMapper mapper=new ObjectMapper();
        Shop shop=null;
        try{
            shop=mapper.readValue(shopStr,Shop.class);
        }catch (Exception e){
            modelMap.put("success",false);
            modelMap.put("errMsg",e.getMessage());
            return modelMap;
        }
        //2 注册店铺
        if(shop!=null){
            PersonInfo owner=new PersonInfo();
            owner.setUserId(1L);
            shop.setOwner(owner);
            ShopExecution se=shopService.addShop(shop);
            if(se.getState()== ShopStateEnum.CHECK.getState()){
                modelMap.put("success",true);
            }else{
                modelMap.put("success",false);
                modelMap.put("errMsg",se.getStateInfo());
            }
            return modelMap;
        }else{
            modelMap.put("success",false);
            modelMap.put("errMsg","请输入店铺信息");
            return modelMap;
        }
        //3 返回结果

    }

//    private static void inputStreamToFile(InputStream ins, File file){
//        OutputStream os=null;
//        try {
//            os=new FileOutputStream(file);
//            int bytesRead=0;
//            byte[] buffer=new byte[1024];
//            while((bytesRead=ins.read(buffer))!=-1){
//                os.write(buffer,0,bytesRead);
//            }
//        }catch (Exception e){
//            throw new RuntimeException("调用inputStreamToFile产生异常:"+e.getMessage());
//        }finally {
//            try {
//                if(os!=null){
//                    os.close();
//                }
//                if(ins!=null){
//                    ins.close();
//                }
//            }catch (IOException e){
//                throw new RuntimeException("inputStreamToFile关闭Io产 生异常:"+e.getMessage());
//            }
//        }
//    }
}
