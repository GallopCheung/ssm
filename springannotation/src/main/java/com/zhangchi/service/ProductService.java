package com.zhangchi.service;

import com.zhangchi.dao.ProductDao;
import com.zhangchi.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 23:15 2018/7/18
 * @Modified By:
 */
@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    @Transactional(rollbackFor = RuntimeException.class)
    public void batchSave(List<Product> productList){

        for(Product product : productList){

            productDao.save(product);
        }

    }



}
