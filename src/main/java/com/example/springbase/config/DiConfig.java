package com.example.springbase.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by decre.liao on 2018/2/1 0001.
 */
@Configuration
@ComponentScan("com.example.springbase.service") //自动扫包
public class DiConfig {
}
