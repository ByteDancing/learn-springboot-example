package com.union.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.union.entity.User;
import com.union.mapper.UserMapper;
import com.union.service.UserService;
import com.union.util.PageBean;
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
    public List<User> queryList(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<User> userList = userMapper.queryList();
        int countNum = userMapper.countList();
        PageBean<User> dataList = new PageBean<User>(currentPage, pageSize, countNum);
        dataList.setItems(userList);
        return dataList.getItems();
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
