package com.example.springbase.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by decre.liao on 2018/2/6 0006.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async //表明此方法为异步方法
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1: " + (i + 1));
    }
}
