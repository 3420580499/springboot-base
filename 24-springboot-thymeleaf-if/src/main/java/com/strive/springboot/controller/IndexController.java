package com.strive.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.messageresolver.IMessageResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author 小白
 * @create 2021/10/29
 */
@Controller
public class IndexController {
    //条件判断表达式
    @RequestMapping("/if")
    public String grammarIf(Model model){
        String message = "true";
        Integer productType = 2;
        model.addAttribute("grammarIf", message);
        model.addAttribute("productType", productType);
        return "grammarIf";
    }
    //内联表达式的使用
    @RequestMapping("/restrained")
    public String restrained(Model model){
        String message = "我是数据";
        model.addAttribute("data", message);
        return "restrained";
    }
    //字符串的拼接
    @RequestMapping("/splicing")
    public String splicingString(Model model){
        Integer totalRows = 23;
        Integer totalPages = 134;
        Integer currentPages = 22;
        model.addAttribute("totalRows",totalRows);
        model.addAttribute("totalPages",totalPages);
        model.addAttribute("currentPages",currentPages);
        return "splicingString";
    }
    //运算符
    @RequestMapping("/operator")
    public String operator(Model model){
        Integer sex = 1;
        model.addAttribute("sex", sex);
        return "operator";
    }

    //从session中获取值
    //拼接访问路径
    @RequestMapping("/session")
    public String session(HttpServletRequest request ,Model model){
        String data = "我是数据";
        request.getSession().setAttribute("data",data);
        return "path";
    }

    //格式化日期
    @RequestMapping("/time")
    public String time(Model model){
        Date date = new Date();
        String data = "我是数据";
        model.addAttribute("data",data);
        model.addAttribute("time",date);
        return "function";
    }

}
