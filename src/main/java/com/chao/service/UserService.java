package com.chao.service;


import com.chao.bean.UserDO;
import com.chao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public UserDO getUserInfo(Integer id){
        return userMapper.selectById(id);
    }

    public String getRedisInfo(){
        return stringRedisTemplate.opsForValue().get("test");
    }
}
