package com.jzx.o2o.service;

import com.jzx.o2o.BaseTest;
import com.jzx.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

import java.util.List;

/**
 * @ClassName: AreaServiceTest
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/1 0001下午 2:08
 */
public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList(){
        List<Area>areaList=areaService.getAreaList();
        assertEquals("南苑",areaList.get(0).getAreaName());
    }
}
