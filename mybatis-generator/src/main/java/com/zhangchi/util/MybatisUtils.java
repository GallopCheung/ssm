package com.zhangchi.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 9:36 2018/7/13
 * @Modified By:
 */

public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
    static {

        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        /* 2.创建SqlSessionFactory */
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return  sqlSessionFactory;
    }

    public static SqlSession getSqlSession(){
        return getSqlSessionFactory().openSession();
    }

    public static SqlSession getSqlSession(boolean autoCommit){
        return  getSqlSessionFactory().openSession(autoCommit);
    }

}
