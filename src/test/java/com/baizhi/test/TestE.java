package com.baizhi.test;

import com.baizhi.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//猿人2修改 
public class TestE {
    @Test
    public void test1(){
        //创建spring工厂
        ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Spring 会自动创建Dao接口的实现类，配置文件中隐藏着id为  接口名称首字母小写
        UserDao userDao = (UserDao)ac.getBean("userDao");

        // userDao.insert(new User(null,"诸葛孔明","111"));
        //userDao.delete(2);
        //userDao.update(new User(1,"你好啊","111"));


    }
}
