package com.zhangchi.mapper;

import com.zhangchi.entity.Kaola;
import com.zhangchi.test.BaseTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 14:38 2018/7/19
 * @Modified By:
 */

public class KaolaTest extends BaseTestCase {

    @Autowired
    private KaolaMapper kaolaMapper;

    @Test
    public void findID(){

        Kaola kaola = kaolaMapper.selectByPrimaryKey(2780);
        System.out.println(kaola);


    }


}
