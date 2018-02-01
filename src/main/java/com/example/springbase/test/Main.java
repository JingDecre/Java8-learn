package com.example.springbase.test;

import com.example.springbase.config.JavaConfig;
import com.example.springbase.service.UseNoAnFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by decre.liao on 2018/2/1 0001.
 */
public class Main {
    public static void main(String[] args) {
//        //Spring容器，输入一个类作为参数
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiConfig.class);
//        //声明配置的UseFunctionService的Bean
//        UseFunctionService useFunctionService = applicationContext.getBean(UseFunctionService.class);
//        System.out.println(useFunctionService.SayHello("臭智在"));
//
//        applicationContext.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseNoAnFunctionService useNoAnFunctionService = context.getBean(UseNoAnFunctionService.class);
        System.out.println(useNoAnFunctionService.SayHello("臭智在"));
        context.close();
    }
}
