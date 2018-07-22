package com.zhangchi.dao;

import com.zhangchi.entity.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 14:57 2018/7/17
 * @Modified By:
 */
@Repository
public class ProductDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Product product){

        String sql = "insert into product(product_name, product_num, product_supplier) values (?,?,?)";
        jdbcTemplate.update(sql,product.getProductName(), product.getProductNum(),product.getProductSupplier());
    }
    public Product finById(Integer id){
        String sql = "Select * from product where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Product.class),id);

    }

    public List<Product> findAll(){

        String sql = "select * from product";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Product.class));

    }
    public int count(){
        String sql = "select count(*) from product";
        return jdbcTemplate.queryForObject(sql,new SingleColumnRowMapper<Long>()).intValue();
    }

    public List<Map<String,Object>> findMapList(){

        String sql = "select * from product";
        return jdbcTemplate.query(sql,new ColumnMapRowMapper());
    }


}
