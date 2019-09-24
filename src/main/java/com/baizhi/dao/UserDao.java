package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserDao {
    public User selectByName(String username);
    public void insert(User user);
}
