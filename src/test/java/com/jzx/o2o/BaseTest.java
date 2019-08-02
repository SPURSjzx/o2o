package com.jzx.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 用来配置spring和junit整合 junit启动时加载springioc容器
 * @ClassName: BaseTest
 * @Description: TODO
 * @Author: Jzxxxxx
 * @Date: Created in 2019/8/1 0001上午 10:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉JUNIT spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {
}
