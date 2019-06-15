package com.union;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * description
 * 定时任务
 *
 * @author Mr.Cheng
 * @date 2019/6/15
 */
@EnableScheduling   //开启定时任务
@SpringBootApplication
public class TimerApplication {
    private static final Logger logger = LoggerFactory.getLogger(TimerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TimerApplication.class,args);
        logger.info("TimerApplication start success. . . . .");
    }
}
