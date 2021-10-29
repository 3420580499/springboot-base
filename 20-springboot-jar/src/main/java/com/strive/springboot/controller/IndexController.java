package com.strive.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 小白
 * @create 2021/10/24
 */
@Controller
public class IndexController {

    @RequestMapping("/jar")
    public ModelAndView jar(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return  modelAndView;
    }
}
