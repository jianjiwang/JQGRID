package com.baizhi.test;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    @Test
    public void test1(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        List<User> users = userDao.selectAll(1, 3);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
