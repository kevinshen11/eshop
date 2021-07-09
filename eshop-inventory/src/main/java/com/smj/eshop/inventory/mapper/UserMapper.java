package com.smj.eshop.inventory.mapper;

import com.smj.eshop.inventory.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 测试用户的Mapper接口
 */
public interface UserMapper {

    /**
     * 查看测试用户信息
     * @return
     */
    public User findUserInfo();
}
