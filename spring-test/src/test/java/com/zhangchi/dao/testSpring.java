package com.zhangchi.dao;

import com.zhangchi.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 14:45 2018/7/14
 * @Modified By:
 */

public class testSpring {


    @Test
    public void testSave(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // String string =applicationContext.getApplicationName();

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();


    }


}
