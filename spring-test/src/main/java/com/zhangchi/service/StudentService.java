package com.zhangchi.service;

import com.zhangchi.dao.StudentDao;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 14:38 2018/7/14
 * @Modified By:
 */

public class StudentService {

    private StudentDao studentDao;

    /*public StudentService(StudentDao studentDao){

        this.studentDao = studentDao;
    }*/

    public void setStudentDao(StudentDao studentDao){

        this.studentDao = studentDao;

    }

    public void save(){
        studentDao.save();

    }


}
