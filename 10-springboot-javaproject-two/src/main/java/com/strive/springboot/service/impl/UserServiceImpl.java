package com.strive.springboot.service.impl;

import com.strive.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 小白
 * @create 2021/10/23
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String say() {
        return "使用第二种方式";
    }
}
