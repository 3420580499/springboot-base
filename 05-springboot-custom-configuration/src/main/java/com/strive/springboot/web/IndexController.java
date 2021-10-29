package com.strive.springboot.web;

import com.strive.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小白
 * @create 2021/10/17
 */
@Controller
public class IndexController {

    @Autowired
    private School school;

    @Value("${name}")
    private String name;

    @RequestMapping("/index")
    @ResponseBody
    public String index (){
        return name;
    }

    @RequestMapping("/obj")
    @ResponseBody
    public Object obj (){
        return school;
    }
}
