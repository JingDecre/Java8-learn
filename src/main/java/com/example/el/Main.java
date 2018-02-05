package com.example.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by decre.liao on 2018/2/5 0005.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);

        resourceService.outputResource();

        context.close();

    }
}
