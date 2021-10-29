package com.strive.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小白
 * @create 2021/10/16
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String index (){
       return  "hello springboot";
    }
}
