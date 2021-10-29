package com.strive.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 小白
 * @create 2021/10/23
 */
@Controller
@RequestMapping("/user")
public class IndexController {

    @GetMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request){
        request.getSession().setAttribute("user","no null !!!");
        return "成功登录";
    }

    @GetMapping("/error")
    @ResponseBody
    public String error(){
        return "请先登录";
    }

    @GetMapping("/out")
    @ResponseBody
    public String out(){
        return "你已经登出";
    }

    @GetMapping("/web")
    @ResponseBody
    public String web(){
        return "这是展示的页面";
    }


}
