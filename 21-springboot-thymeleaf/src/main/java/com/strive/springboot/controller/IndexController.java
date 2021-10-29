package com.strive.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 小白
 * @create 2021/10/24
 */
@Controller
public class IndexController {

    @RequestMapping("/mes")
    public String mes (HttpServletRequest request){
        request.setAttribute("message","我是springboot");
        /*这里会去找message.html*/
        return "message";
    }
}
