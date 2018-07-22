package com.zhangchi.entity;

import sun.security.timestamp.TimestampToken;

import java.sql.Timestamp;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 23:17 2018/7/18
 * @Modified By:
 */

public class Product {

    private Integer id;
    private String productName;
    private Integer productNum;
    private  String productSupplier;
    private Timestamp dateOfProduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public String getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }

    public Timestamp getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Timestamp dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }
}
