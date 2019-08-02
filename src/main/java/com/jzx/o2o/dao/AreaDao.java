package com.jzx.o2o.dao;

import com.jzx.o2o.entity.Area;

import java.util.List;

/**
 * @ClassName: AreaDao
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/1 0001上午 9:49
 */
public interface AreaDao {
    /**
     * 列出区域列表
     * @return arealist
     */
    List<Area> queryArea();
}
