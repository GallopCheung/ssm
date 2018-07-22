package com.zhangchi.proxy;

import com.zhangchi.proxy.Lenovo;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 14:21 2018/7/16
 * @Modified By:
 */

public class SubjectInvocationHandler implements InvocationHandler {

    private Object target;

    public SubjectInvocationHandler(Object target){

        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        /**
         * proxy : 没有任何作用
         * method: 目标对象的方法的详情对象，通过反射机制调用invoke方法运行该方法
         * args: 目标方法执行时的参数列表
         */
        System.out.println("--------------------Before-------------------------");
        Object result = method.invoke(target,args);
        System.out.println("---------------------After------------------------");
        return result;
    }



}
