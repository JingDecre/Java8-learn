package com.example.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by decre.liao on 2018/2/5 0005.
 */
@Service
public class DemoService
{
    @Value("其他类属性") //注入普通字符串
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
