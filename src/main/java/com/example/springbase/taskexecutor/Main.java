package com.example.springbase.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by decre.liao on 2018/2/6 0006.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskexecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for(int i=0; i <10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
    }


}
