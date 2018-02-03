package com.example.springbase.test;

import com.example.springbase.config.AopConfig;
import com.example.springbase.service.DemoAnnotationService;
import com.example.springbase.service.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by decre.liao on 2018/2/3 0003.
 */
public class AopMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
