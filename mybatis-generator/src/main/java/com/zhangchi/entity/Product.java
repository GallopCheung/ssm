package com.zhangchi.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 张驰
 */
public class Product implements Serializable {
    private Integer id;

    private String productName;

    private String productNum;

    private String productSupplier;

    private Date dateOfProduction;

    private static final long serialVersionUID = 1L;

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

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductSupplier() {
        return productSupplier;
    }

    public void setProductSupplier(String productSupplier) {
        this.productSupplier = productSupplier;
    }

    public Date getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(Date dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductNum() == null ? other.getProductNum() == null : this.getProductNum().equals(other.getProductNum()))
            && (this.getProductSupplier() == null ? other.getProductSupplier() == null : this.getProductSupplier().equals(other.getProductSupplier()))
            && (this.getDateOfProduction() == null ? other.getDateOfProduction() == null : this.getDateOfProduction().equals(other.getDateOfProduction()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductNum() == null) ? 0 : getProductNum().hashCode());
        result = prime * result + ((getProductSupplier() == null) ? 0 : getProductSupplier().hashCode());
        result = prime * result + ((getDateOfProduction() == null) ? 0 : getDateOfProduction().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productName=").append(productName);
        sb.append(", productNum=").append(productNum);
        sb.append(", productSupplier=").append(productSupplier);
        sb.append(", dateOfProduction=").append(dateOfProduction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}