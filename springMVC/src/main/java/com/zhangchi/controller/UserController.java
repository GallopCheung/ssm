package com.zhangchi.controller;

import com.zhangchi.entity.User;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id:\\d+}")
    public String showUser(@RequestParam(name = "pageNo",defaultValue = "1") Integer p,
                           @PathVariable(name = "id") Integer userId,  Model model){

        System.out.println("pageNo:" + p);
        System.out.println("get user..." + userId);
        model.addAttribute("userId",userId);
        return "user/home";
    }

    @GetMapping
    public String userSave(){

        return null;

    }

}
