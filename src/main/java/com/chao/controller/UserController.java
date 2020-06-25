package com.chao.controller;

import com.chao.bean.UserDO;
import com.chao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/selectById")
    public UserDO selectById() {
        return userService.getUserInfo(1);
    }

    @GetMapping("/selectRedisInfo")
    public String selectRedisInfo() {
        return userService.getRedisInfo();
    }
}
