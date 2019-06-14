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
public class ApplicationStart {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationStart.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
        logger.info("ApplicationStart start success. . . . . . ");
    }
}
