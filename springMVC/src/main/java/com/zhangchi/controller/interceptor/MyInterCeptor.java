package com.zhangchi.controller.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 15:40 2018/7/23
 * @Modified By:
 */

public class MyInterCeptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("----------------");
        String uri = request.getRequestURI();
        if(uri.startsWith("/static")){
            return true;
        }

        // 判断是否登陆
        HttpSession session = request.getSession();
        if(session.getAttribute("admin_shan") == null){
            response.sendRedirect("/login");
        }

        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("----------------post---------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("----------------after callback---------------");
    }
}
