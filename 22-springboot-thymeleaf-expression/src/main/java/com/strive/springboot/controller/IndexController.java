package com.strive.springboot.controller;

import com.strive.springboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 小白
 * @create 2021/10/25
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index (Model model){
        model.addAttribute("info",new User(1001,"小李",12));
        //这里会去找expression.html
        return "expression";
    }

    @RequestMapping("/url")
    public String url(HttpServletRequest request){
        request.setAttribute("user",new User(1002,"小红",16));
        return  "url";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test (String name){
        return name;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public Object test1(User user){
        return user;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public Object test2(String name){
        return name;
    }

    @RequestMapping("/test3/{age}")
    @ResponseBody
    public Object test3(@PathVariable("age")  Integer age){
        return age;
    }
}
