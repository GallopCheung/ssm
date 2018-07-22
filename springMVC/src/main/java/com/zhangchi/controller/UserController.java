package com.zhangchi.controller;

import com.zhangchi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 14:30 2018/7/20
 * @Modified By:
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/add")
    public String addUser(){
        return "user/add";
    }

    @PostMapping("/add")
    public String addUser(User user,String tel){

        System.out.println("username:" + user.getUserName());
        System.out.println("password:" + user.getPassword());
        System.out.println("tel" + tel);
        return "redirect:/user/home" ;
    }

    @GetMapping("/home")
    public String home(){

        return "/user/home";
    }


}
