package com.strive.springboot;

import com.strive.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//实现这个接口后,会自动调用类中重写的run方法
public class Application implements CommandLineRunner {
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //这个方法里面可以拿到spring容器中创建好的对象
        System.out.println(userService.say());
    }
}
