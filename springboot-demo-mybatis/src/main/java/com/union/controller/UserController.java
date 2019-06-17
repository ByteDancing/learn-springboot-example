package com.union.controller;

import com.union.entity.User;
import com.union.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.util.List;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2019/6/16
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list() {
        List<User> dataList = userService.queryList(1,3);
        return "ssss";
    }


    @RequestMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.insertUser(user);
        return "insert success";

    }


    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        log.info("delete user id={}", id);
        userService.deleteUser(id);
        return "delete success";

    }
}
