package com.example.springbase.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by decre.liao on 2018/2/7 0007.
 */
@Configuration
@ComponentScan("com.example.springbase.taskscheduler")
@EnableScheduling // 开启对计划任务支持
public class TaskSchedulerConfig {
}
