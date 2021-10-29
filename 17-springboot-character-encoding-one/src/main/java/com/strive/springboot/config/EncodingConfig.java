package com.strive.springboot.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * @author 小白
 * @create 2021/10/23
 */
@Configuration
public class EncodingConfig {
    /*
    * 使用配置类的形式来配置字符编码的过滤器
    **/
    @Bean
    public FilterRegistrationBean myFilterRegistrationBean(){
        //创建字符编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        //设置强制使用指定字符编码(强制要求请求对象和响应对象使用要求的编码方式)
        characterEncodingFilter.setForceEncoding(true);
        //设置指定字符编码
        characterEncodingFilter.setEncoding("UTF-8");
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        //设置为字符编码过滤器
        filterRegistrationBean.setFilter(characterEncodingFilter);
        //设置字符编码过滤器路径
        filterRegistrationBean.addUrlPatterns("/user/login");
        return filterRegistrationBean;
    }
}
