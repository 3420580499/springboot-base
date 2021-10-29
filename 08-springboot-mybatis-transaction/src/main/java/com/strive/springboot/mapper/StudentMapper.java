package com.strive.springboot.mapper;

import com.strive.springboot.pojo.Student;
import org.apache.ibatis.annotations.Mapper;


/*
*扫描dao接口到spring容器中
* */
/*@Mapper*/
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    //如果你传进来的student对象只有name,那么age不会变
    int updateByPrimaryKeySelective(Student record);
    //如果你传进来的student对象只有name,那么age会被修改为null
    int updateByPrimaryKey(Student record);
}