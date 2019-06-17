package com.union.controller;

import com.union.Application;
import com.union.entity.User;
import com.union.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class UserControllerTest {

    @Autowired
    private UserService service;

    @Test
    public void list() {
        List<User> userList = service.queryList(2,5);
        for (User user : userList) {
            log.info(user.getId() + "," + user.getUsername());
        }
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUsername("奥利奥");
        user.setPassword("920920");
        user.setNickname("allMyLove");
        user.setQuestion("do you love me");
        user.setAnswer("I do");
        service.insertUser(user);
    }

    @Test
    public void deleteUser() {
        String id = "1222";
        log.info("delete user id={}", id);
        service.deleteUser(id);
    }

    @Test
    public void updateUser(){
        User user = new User("1224","dream","1234444","ddr","hello?","yes",null,null);
        service.updateUser(user);
    }
}