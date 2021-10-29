package com.strive.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        //获取入口SpringBoot类
        SpringApplication application = new SpringApplication(Application.class);
        //设置它的属性(logo是否关闭)
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);

        //如果想要改变logo,可以在resources下面建一个banner.txt文件,里面放logo
    }

}
