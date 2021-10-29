package com.strive.springboot.config;

import com.strive.springboot.controller.OneServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 小白
 * @create 2021/10/23
 */

//采用配置类的方式来配置servlet,主入口里不用在去写注解扫描servlet类l,spring会识别配置类来工作
@Configuration  //这是一个配置类
public class ServletConfig {

    //@Bean是一个方法级别上的注解,主要用在配置类里
    //相当于一个
    // <beans>
    //      <bean id="" class="">
    // </beans>
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new OneServlet(), "/one");
        return bean;
    }
}
