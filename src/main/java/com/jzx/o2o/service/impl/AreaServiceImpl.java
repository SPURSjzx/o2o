package com.jzx.o2o.service.impl;

import com.jzx.o2o.dao.AreaDao;
import com.jzx.o2o.entity.Area;
import com.jzx.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AreaServiceImpl
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/1 0001下午 2:05
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
