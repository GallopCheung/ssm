package com.zhangchi;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 23:37 2018/7/18
 * @Modified By:
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
// @ContextConfiguration(classes = Application.class)
public class BaseTestCase {
}
