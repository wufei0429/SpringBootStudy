package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

public class UserServiceImplTest {
    @Resource

    private UserService userService;


    @Test
    public void selectAll() {
        List<User> userList = userService.selectAll();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void getOne() {
        User user = userService.getOne(1L);
        System.out.println(user);
    }

    @Test
    public void delete() {
        userService.delete(5L);
    }

    @Test
    public void insert() {
        User user=new User();
        user.setMobile("17635295479");
        user.setPassword("147258");
        user.setAvatar("user3.jpg");
        user.setUserName("浮生");
        userService.insert(user);

    }

    @Test
    public void update() {
        User user=userService.getOne(4L);
        user.setAvatar("user4.jpg");
        user.setMobile("18965542584");
        user.setUserName("若梦");
        userService.update(user);

    }
}
