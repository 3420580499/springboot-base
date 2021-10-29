package com.strive.springboot.web;

import com.strive.springboot.pojo.Student;
import com.strive.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 小白
 * @create 2021/10/21
 */
@Controller
public class IndexController {

    @Autowired
    private StudentService service;

    @RequestMapping("student")
    @ResponseBody
    public Student student(Integer id){
        return service.selectStudentById(id);
    }
}
