package com.strive.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.strive.springboot.mapper")//开启扫描Mapper接口的包以及子目录(就可以不用加@Mapper)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
