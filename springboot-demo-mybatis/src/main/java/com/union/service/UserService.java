package com.union.service;

import com.union.entity.User;

import java.util.List;

public interface UserService {


    List<User> queryList();

    void insertUser(User user);

    void deleteUser(String id);

    void updateUser(User user);
}
