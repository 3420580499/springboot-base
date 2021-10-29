package com.strive.springboot.config;

import com.strive.springboot.handler.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 小白
 * @create 2021/10/23
 */
//告诉spring这是一个配置类(相当于之前的xml文件)
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    //要拦截user下的所有访问请求,必须用户登录后才可访问,
    // 但是这样拦截的路径中有一些是不需要用户登录也可访问的
    String[] addPathPatterns = {
            "/user/**"
    };

    //要排除的路径,排除的路径说明不需要用户登录也可访问
    String[] excludePathPatterns = {
            "/user/out", "/user/error","/user/login"
    };


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //将你写的拦截器加入其中,并且可以指定它所拦截的请求和不拦截的请求
        registry.addInterceptor(new MyInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
