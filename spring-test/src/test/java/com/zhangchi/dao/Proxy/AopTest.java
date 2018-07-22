package com.zhangchi.dao.Proxy;

import com.zhangchi.proxy.Sale;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 9:38 2018/7/17
 * @Modified By:
 */

public class AopTest {

    @Test
    public void test(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        // 此时获得的lenovo是增强过后的动态代理类对象，因此不能强转为Lenovo,否则会抛出java.lang.ClassCastException:
        Sale sale = (Sale) applicationContext.getBean("lenovo");

        System.out.println(sale.getClass().getName());

        sale.salePc();
        /*int price = sale.salePrice();*/
    }



}
