package com.jdbc.controller;

import com.jdbc.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 * jdbcTemplate 测试
 * 默认使用HikariDataSource数据源
 *
 * @author Mr.Cheng
 * @date 2019/6/18
 */
@Slf4j
@RestController
public class JdbcController {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("/query")
    public String query() {
        List<User> userList = jdbcTemplate.query("select * from user ;", new Object[]{}, new BeanPropertyRowMapper<User>(User.class));
        for (User user : userList) {
            log.info("user:" + user.getId() + "--" + user.getUsername());
        }
        return "success";
    }

}
