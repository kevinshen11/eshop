package com.smj.eshop.inventory.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.smj.eshop.inventory.dao.RedisDAO;
import com.smj.eshop.inventory.mapper.UserMapper;
import com.smj.eshop.inventory.model.User;
import com.smj.eshop.inventory.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户service实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private RedisDAO redisDAO;

    @Override
    public User findUserInfo() {
        return userMapper.findUserInfo();
    }

    @Override
    public User getCachedUserInfo() {
        redisDAO.set("cached_user", "{\"name\": \"lisi\", \"age\": 25}") ;
        String json = redisDAO.get("cached_user");
        JSONObject jsonObject = JSONObject.parseObject(json);

        User user = new User();
        user.setName(jsonObject.getString("name"));
        user.setAge(jsonObject.getInteger("age"));

        return user;
    }
}
