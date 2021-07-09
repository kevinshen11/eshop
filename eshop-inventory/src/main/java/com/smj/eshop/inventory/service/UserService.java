package com.smj.eshop.inventory.service;

import com.smj.eshop.inventory.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 用户service接口
 */
public interface UserService {

    /**
     * 查询用户信息
     * @return
     */
    public User findUserInfo();

    /**
     * 查询缓存中的用户信息
     * @return
     */
    public User getCachedUserInfo();
}
