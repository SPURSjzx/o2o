package com.jzx.o2o.dao;

import static org.junit.Assert.*;
import com.jzx.o2o.BaseTest;
import com.jzx.o2o.entity.Area;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * @ClassName: AreaDaoTest
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/1 0001上午 10:23
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList=areaDao.queryArea();
        assertEquals(3,areaList.size());
        for(int i=1;i<areaList.size();i++){
            System.out.println(areaList.get(i));
        }
    }

}
