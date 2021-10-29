package com.strive.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小白
 * @create 2021/10/17
 */
@Controller
public class IndexController {
    @ResponseBody
    @RequestMapping(value = "/index")
    public String index(){
        return "hello multi-properties";
    }
}
