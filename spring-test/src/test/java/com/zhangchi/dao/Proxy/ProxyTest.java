package com.zhangchi.dao.Proxy;

import com.zhangchi.proxy.Lenovo;
import com.zhangchi.proxy.Proxy;
import com.zhangchi.proxy.Sale;
import com.zhangchi.proxy.SubjectInvocationHandler;
import org.junit.Test;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 11:22 2018/7/16
 * @Modified By:
 */

public class ProxyTest {

    @Test
    public void lenovoProxy(){

        Lenovo lenovo = new Lenovo();
        Proxy proxy = new Proxy(lenovo);
        proxy.salePc();

    }

    @Test
    public void testDynamicProxy(){
        // 目标对象
        Lenovo lenovo = new Lenovo();

        SubjectInvocationHandler invocationHandler = new SubjectInvocationHandler(lenovo);

        Sale sale = (Sale) java.lang.reflect.Proxy.newProxyInstance(Lenovo.class.getClassLoader(),
                Lenovo.class.getInterfaces(),
                invocationHandler);

        System.out.println(sale.getClass().getName());

        sale.salePc();

    }

}
