package com.example.springbase.aop;

import java.lang.annotation.*;

/**
 * Created by decre.liao on 2018/2/3 0003.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
