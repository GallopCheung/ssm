package com.zhangchi.dao.Proxy;

import com.zhangchi.proxy.cglib.ProxySale;
import com.zhangchi.proxy.cglib.Sale;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 20:23 2018/7/16
 * @Modified By:
 */

public class CglibTest {

    @Test
    public void test(){

       ProxySale sale = new ProxySale();
        sale.salePc();


    }

    @Test
    public void cglibTest(){
        // 创建Enhancer 对象
        Enhancer en = new Enhancer();
        // 设置属性
        en.setSuperclass(Sale.class);
        // 设置目标对象
        en.setCallback(new MethodInterceptor() {
            /**
             *
             * @param target 目标对象
             * @param method 暂时没用
             * @param args 方法参数列表
             * @param methodProxy  产生父类方法的代理方法对象
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

                System.out.println("----------------");
                // 执行目标对象的方法
                Object obj = methodProxy.invokeSuper(target,args);
                System.out.println("=================");
                return obj;
            }
        });
                // 动态产生代理类对象
                Sale sale = (Sale) en.create();
                System.out.println(sale.getClass().getName());
                sale.salePc();


    }

}
