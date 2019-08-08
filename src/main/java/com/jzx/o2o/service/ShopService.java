package com.jzx.o2o.service;

import com.jzx.o2o.dto.ShopExecution;
import com.jzx.o2o.entity.Shop;
import org.springframework.stereotype.Service;


/**
 * @ClassName: ShopService
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/7 0007上午 9:05
 */
@Service
public interface ShopService {

    ShopExecution addShop(Shop shop);
}
