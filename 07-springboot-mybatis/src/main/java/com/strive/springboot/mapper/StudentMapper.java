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

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}