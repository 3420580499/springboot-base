package com.strive.springboot.web;

import com.strive.springboot.pojo.Student;
import com.strive.springboot.service.StudentService;
import org.apache.ibatis.annotations.Delete;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * @author 小白
 * @create 2021/10/21
 */
//@Controller
@RestController //这个注解代表了@Controller和@ResponseBody(controller类所有的方法都会加上这个注解)
public class IndexController {

    @Autowired
    private StudentService service;

    //@RequestMapping(value = "student",method = RequestMethod.GET)
    @GetMapping("/student")  //这种写法相当于上面的写法
    public Student student(Integer id){
        return service.selectStudentById(id);
    }


    //对于更新操作,我们一般都要加上事务
    @Transactional
    //@RequestMapping(value = "/update",method = RequestMethod.POST)
    @PostMapping("/update")
    public String update(Integer id,String name){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int result = service.updateStudentById(student);
        //如果此处发生了异常,我们的事务一定要回滚
        // int i = 1/0;
        return "成功修改了id为"+id+"的同学的名字为"+name;
    }

    //使用restful风格的形式来接收请求
    //@RequestMapping("/restful/{id}/{name}/{age}")
    //使用restful分格时要保证请求地址和参数不是一样的,否则会出错
    //可以给不同的请求加上不同的请求方式,加以区分
    //@DeleteMapping("/restful/{id}/{name}/{age}")
    @PostMapping("/restful/{id}/{name}/{age}")
    public Object restful(@PathVariable("id") Integer id,
                          @PathVariable("name") String name,
                          @PathVariable("age") String age){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        return student ;
    }
}
