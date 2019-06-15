package com.union.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * description
 * 基于注解SpringBoot定时任务
 * 串行任务一个任务卡死，其余任务无法执行
 *
 * @author Mr.Cheng
 * @date 2019/6/15
 */
@RestController
public class TimerController {

    private static final Logger logger = LoggerFactory.getLogger(TimerController.class);

    @Scheduled(cron = "0/5 * * * * *")         //添加定时任务
    @RequestMapping("/export")
    @Async
    public void export() {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>Corn执行定时任务时间:" + LocalDateTime.now());


    }

    @Scheduled(fixedRate = 5000)    //上一次开始执行时间点之后5秒再执行
    @Async
    public void scheduled1() {
        logger.info("=====>>>>>使用fixedRate{}", LocalDateTime.now());
    }

    @Scheduled(fixedDelay = 5000)   //上一次执行完毕时间点之后5秒再执行
    @Async
    public void scheduled2() {
        logger.info("=====>>>>>fixedDelay{}", LocalDateTime.now());
    }
}
