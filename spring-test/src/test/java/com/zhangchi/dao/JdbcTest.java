package com.zhangchi.dao;


import com.zhangchi.entity.Product;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 14:54 2018/7/17
 * @Modified By:
 */

public class JdbcTest extends BaseTestCase {

    @Autowired
    private ProductDao productDao;

    @Test
    public void testSave(){

        Product product = new Product();
        product.setProductName("oppo find X");
        product.setProductNum(180);
        product.setProductSupplier("广东oppo公司");
        productDao.save(product);
    }

    @Test
    public void testFindById(){

        Product product = productDao.finById(3);
        System.out.println(product);
        Assert.assertNotNull(product);

    }

    @Test
    public void testFindAll(){

        List<Product> productList = productDao.findAll();
        for(Product product : productList){
            System.out.println(product);
        }

    }

    @Test
    public void testCount(){

        int count = productDao.count();
        // System.out.println(count);
        Assert.assertEquals(3,count);

    }

    @Test
    public void findMapList(){

        List<Map<String,Object>> mapList = productDao.findMapList();
        for(Map<String,Object> map : mapList){
            for(Map.Entry<String,Object> entry : map.entrySet() ){
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }


        }

    }


}
