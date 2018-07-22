package com.zhangchi.proxy;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 10:51 2018/7/16
 * @Modified By:
 */

public class Proxy implements Sale {

    private Sale sale;

    public Proxy(Sale sale){
        this.sale = sale;
    }


    @Override
    public void salePc() {

        System.out.println("jd加价购,满10元可送一辆法拉利");
        sale.salePc();
        System.out.println("---------------------");
        System.out.println("做梦吧你");
    }
}
