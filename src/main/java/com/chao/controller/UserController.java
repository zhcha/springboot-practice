package com.chao.controller;

import com.chao.bean.UserDO;
import com.chao.service.UserService;
import com.chao.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/selectById")
    public UserDO selectById(@RequestBody UserVO user) {
        return userService.getUserInfo(user.getUserId());
    }

    @GetMapping("/selectRedisInfo")
    public String selectRedisInfo() {
        return userService.getRedisInfo();
    }
}
