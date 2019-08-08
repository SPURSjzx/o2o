package com.jzx.o2o.web.shopadmin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: ShopAdimnController
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/7 0007下午 5:30
 */
@Controller
@RequestMapping(value = "shopadmin",method = {RequestMethod.GET})
public class ShopAdminController {
    @RequestMapping(value = "/shopoperation")
    public String shopOperation(){
        //因为在spring-web中设置了前后缀 所以不用加.html
        return "shop/shopoperation";
    }
}
