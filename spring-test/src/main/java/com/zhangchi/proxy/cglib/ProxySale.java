package com.zhangchi.proxy.cglib;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 20:20 2018/7/16
 * @Modified By:
 */

public class ProxySale extends  Sale {


    @Override
    public void salePc() {

        System.out.println("售前服务");
        super.salePc();
        System.out.println("售后服务");

    }
}
