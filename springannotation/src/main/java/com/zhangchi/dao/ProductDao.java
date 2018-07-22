package com.zhangchi.dao;

import com.zhangchi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 23:15 2018/7/18
 * @Modified By:
 */

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Product product){

        String sql = "insert into product(product_name, product_num, product_supplier) values(?,?,?)";
        jdbcTemplate.update(sql, product.getProductName(),product.getProductNum(),product.getProductSupplier());
    }


}
