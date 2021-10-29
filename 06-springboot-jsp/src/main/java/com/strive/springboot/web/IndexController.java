package com.strive.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 小白
 * @create 2021/10/17
 */
@Controller
public class IndexController {

    @RequestMapping("/hello")
    public ModelAndView index (){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","hello jsp");
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping("/strive")
    public String strive(){
        return "strive !!!";
    }
}
