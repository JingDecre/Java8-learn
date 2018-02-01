package com.example.springbase.service;

/**
 * Created by decre.liao on 2018/2/1 0001.
 */
public class UseNoAnFunctionService {

    NoAnFunctionService noAnFunctionService;

    public void setFunctionService(NoAnFunctionService noAnFunctionService) {
        this.noAnFunctionService = noAnFunctionService;
    }

    public String SayHello(String word) {
        return noAnFunctionService.sayHello(word);
    }
}
