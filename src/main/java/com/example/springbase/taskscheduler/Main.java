package com.example.springbase.taskscheduler;

import com.example.springbase.taskexecutor.TaskexecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by decre.liao on 2018/2/7 0007.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
