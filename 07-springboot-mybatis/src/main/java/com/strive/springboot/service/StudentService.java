package com.strive.springboot.service;

import com.strive.springboot.pojo.Student;

/**
 * @author 小白
 * @create 2021/10/21
 */
public interface StudentService {

    //根据主键查询学生信息
    Student selectStudentById(Integer id);


}
