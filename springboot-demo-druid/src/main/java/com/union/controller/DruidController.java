package com.union.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2019/6/14
 */
@RestController
public class DruidController {
    private static final Logger logger = LoggerFactory.getLogger(DruidController.class);
    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("druidData")
    public String druidData() {
        String sql = "select count(1) from user";
        Integer countUser = jdbcTemplate.queryForObject(sql, Integer.class);
        logger.info("countUser =  " + countUser);
        return "success";
    }

    @RequestMapping("/add")
    public String addUser() {
        String sql = "insert into user(username,password,nickname,question,answer,test_double) values('cc','dd','ee','dd','ff',999)";
        jdbcTemplate.execute(sql);
        return "success insert";
    }


}
