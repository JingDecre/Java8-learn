package com.example.springbase.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by decre.liao on 2018/2/3 0003.
 */
@Configuration
@ComponentScan("com.example.springbase")
@EnableAspectJAutoProxy // 开启Spring对AspectJ的支持
public class AopConfig {
}
