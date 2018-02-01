package com.example.springbase.service;

import org.springframework.stereotype.Service;

/**
 * Created by decre.liao on 2018/2/1 0001.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
