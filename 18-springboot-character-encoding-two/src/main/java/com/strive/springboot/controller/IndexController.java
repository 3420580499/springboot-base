package com.strive.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @author 小白
 * @create 2021/10/23
 */
@Controller
@RequestMapping("/user")
public class IndexController {

    @RequestMapping("/login")
    public void login (HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("我是中文,Mike");
        response.getWriter().flush();
        response.getWriter().close();
    }
}
