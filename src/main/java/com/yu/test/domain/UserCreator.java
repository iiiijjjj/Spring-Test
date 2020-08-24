package com.yu.test.domain;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/8/24 0024 下午 7:04
 */

public class UserCreator {
    public User createUser(){
        User user = new User();
        user.setName("xxx");
        user.setId(1L);
        return user;
    }
}
