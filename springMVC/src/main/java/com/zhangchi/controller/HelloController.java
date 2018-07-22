package com.zhangchi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 8:06 2018/7/20
 * @Modified By:
 */

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("你好m'v'c");
        return "hello";
    }

}
