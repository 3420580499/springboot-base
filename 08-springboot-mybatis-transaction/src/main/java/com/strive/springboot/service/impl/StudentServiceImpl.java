package com.strive.springboot.service.impl;

import com.strive.springboot.mapper.StudentMapper;
import com.strive.springboot.pojo.Student;
import com.strive.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 小白
 * @create 2021/10/21
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student selectStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateStudentById(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }
}
