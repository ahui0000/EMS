package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private String message;
    private User user;
    private UserService userService;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    //管理员登陆功能
    public String login(){
        try{
            userService.login(user);
            return Action.SUCCESS;
        }catch (Exception e){
            message=e.getMessage();
            return Action.ERROR;
        }

    }
    //管理员注册功能
    public  String register(){
        try{
            userService.modifyregister(user);
            return Action.SUCCESS;
        }catch (Exception e){
            message = e.getMessage();
            return Action.ERROR;
        }
    }
}
