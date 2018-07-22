package com.zhangchi.service;

import com.zhangchi.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 9:39 2018/7/18
 * @Modified By:
 */

public class UserService {

    private UserDao userDao;
    private Integer age;
    private String name;
    private List<String> list;
    private Set<Double> set;
    private Map<String,String> map;
    private Properties properties;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Double> getSet() {
        return set;
    }

    public void setSet(Set<Double> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public UserService() {
    }
}
