package com.union.mapper;

import com.union.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> queryList();

    void insertUser(User user);

    void deleteUserById(@Param("id") String id);

    int updateUser(User user);

    int countList();
}
