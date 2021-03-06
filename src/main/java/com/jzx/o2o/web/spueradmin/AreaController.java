package com.jzx.o2o.web.spueradmin;

import com.jzx.o2o.entity.Area;
import com.jzx.o2o.service.AreaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: AreaController
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/1 0001下午 2:14
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {
    Logger logger= LoggerFactory.getLogger(AreaController.class);
    @Autowired
    private AreaService areaService;
    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    //将model转化成json对象返回给前端
    @ResponseBody
    private Map<String,Object> listArea(){
        logger.info("===START===");
        //获取当前时间
        long startTime=System.currentTimeMillis();
        System.out.println(startTime);
        Map<String,Object>modelMap=new HashMap<String,Object>();
        List<Area>list=new ArrayList<Area>();
        try {
            list=areaService.getAreaList();
            modelMap.put("rows",list);
            modelMap.put("total",list.size());
        }catch (Exception e){
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());
        }
        logger.error("test error");
        long endTime=System.currentTimeMillis();
        System.out.println(endTime);
        //方法运行所用时间
        logger.debug("costTime:[{}ms]",endTime-startTime);
        logger.info("===END===");
        return modelMap;
    }
}
