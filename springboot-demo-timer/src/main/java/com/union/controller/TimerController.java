package com.union.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author Mr.Cheng
 * @date 2019/6/15
 */
@RestController
public class TimerController {

    private static final Logger logger = LoggerFactory.getLogger(TimerController.class);

    @Scheduled(cron = "0/5 * * * * ? *")
    public void export() {
        logger.info(">>>>>>>>>>>>>>>>>>>>>>hello");


    }
}
