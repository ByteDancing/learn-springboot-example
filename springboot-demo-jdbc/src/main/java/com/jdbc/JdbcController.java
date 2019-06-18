package com.jdbc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * jdbcTemplate 测试
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
        jdbcTemplate.execute("select * from user");
        return "success";
    }

}
