package com.springboot.java;

import com.springboot.java.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /*第一种方式在java工程中获取service对象*/
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        System.out.println(userService.say());
    }

}
