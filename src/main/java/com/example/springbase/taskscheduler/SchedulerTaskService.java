package com.example.springbase.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by decre.liao on 2018/2/6 0006.
 */
@Service
public class SchedulerTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) //声明为计划任务，每隔5秒执行
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次 " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *") //cron属性可按照指定时间执行， 本例每天11.28
    public void fixTimeExecution() {
        System.out.println("在指定时间 " + dateFormat.format(new Date()) + "执行");
    }
}
