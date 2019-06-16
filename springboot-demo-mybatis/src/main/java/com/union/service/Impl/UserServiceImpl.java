package com.union.service.Impl;

import com.union.entity.User;
import com.union.mapper.UserMapper;
import com.union.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2019/6/16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryList() {
        return userMapper.queryList();
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userMapper.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
