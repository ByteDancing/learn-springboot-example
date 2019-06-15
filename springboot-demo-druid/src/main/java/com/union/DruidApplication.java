package com.union;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2019/6/14
 */
@SpringBootApplication
public class DruidApplication {
    private static final Logger logger = LoggerFactory.getLogger(DruidApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DruidApplication.class, args);
        logger.info("DruidApplication start success. . . . . . ");
    }
}
