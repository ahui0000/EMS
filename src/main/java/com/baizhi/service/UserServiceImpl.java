package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class UserServiceImpl implements  UserService {
   private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login(User user) {
        User user1 = userDao.selectByName(user.getUsername());
        if(user1 == null) throw  new RuntimeException("用户名错误，请重新输入");
        if(!user1.getPassword().equals(user.getPassword())) throw  new RuntimeException("密码错误，请重新输入密码");
        HttpSession session = ServletActionContext.getRequest().getSession();
        session.setAttribute("user",user1);
    }

    @Override
    public void modifyregister(User user) {
        User user1 = userDao.selectByName(user.getUsername());
        if(user1 != null) throw new RuntimeException("用户名已被注册，请重新注册");
        userDao.insert(user);
    }
}
