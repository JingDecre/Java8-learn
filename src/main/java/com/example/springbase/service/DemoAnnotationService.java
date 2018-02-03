package com.example.springbase.service;

import com.example.springbase.aop.Action;
import org.springframework.stereotype.Service;

/**
 * Created by decre.liao on 2018/2/3 0003.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {

    }
}
