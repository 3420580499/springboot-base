package com.strive.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.strive.springboot.controller") //扫描servlet类所在的包,只有这样spring才知道你的servlet在哪
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
