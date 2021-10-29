package com.springboot.java.service.impl;

import com.springboot.java.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 小白
 * @create 2021/10/23
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String say() {
        return "build javaProject";
    }
}
