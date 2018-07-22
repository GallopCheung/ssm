package com.zhangchi.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 22:53 2018/7/16
 * @Modified By:
 */

public class AopAspect {

    public void beforeAdvice(JoinPoint joinPoint) {

        String methodName = joinPoint.getSignature().getName();
        Object[] objects = joinPoint.getArgs();
        System.out.println(methodName);
        System.out.println("前置通知");
    }

    public void afterAdvice(Object result) {
        System.out.println("后置通知" + result);
    }

    public void exceptionAdvice(Exception e) {
        System.out.println("异常通知" + e.getMessage());
    }

    public void finallyAdvice() {
        System.out.println("最终通知");
    }


    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

        System.out.println("我是前置通知");
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
            System.out.println("我应该是后置通知了");
        } catch (Throwable throwable) {
            System.out.println("我是异常通知");
        } finally {
            System.out.println("我是最终通知了");
        }
        return result;


    }

}
