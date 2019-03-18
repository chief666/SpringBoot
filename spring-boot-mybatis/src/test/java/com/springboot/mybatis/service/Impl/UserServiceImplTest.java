package com.springboot.mybatis.service.Impl;

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
        List<User> userList=userService.selectAll();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void getOne() {
        User user = userService.getOne(1l);
        System.out.println(user);
    }

    @Test
    public void delete() {
        userService.delete(1l);
    }

    @Test
    public void insert() {
        User user = new User();
        user.setUserName("fei");
        user.setMobile("1362856113");
        user.setUserId(1l);
        user.setAvatar("2.jpg");
        user.setPassword("444");
        userService.insert(user);
    }

    @Test
    public void update() {
        User user = userService.getOne(2l);
        user.setAvatar("888.jpg");
        userService.update(user);
    }
}