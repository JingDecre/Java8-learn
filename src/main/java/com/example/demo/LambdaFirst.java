package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by decre.liao on 2018/1/4 0004.
 */
public class LambdaFirst {
    public static void main(String[] args) {

        //使用() -> {} 替代匿名类
        new Thread(() -> {Arrays.asList(1,2,3,4).stream().filter((s) -> s > 2).forEach(System.out::println);}).start();

        //使用内循环代替外循环
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API",
                "Date and Time API");
        features.forEach(System.out::println);

        //函数式编程
        filter(features, (str) -> String.valueOf(str).startsWith("S"));

        System.out.println();
        List<String> names = features.stream().map(String::toLowerCase).collect(Collectors.toList());
        names.forEach(System.out::print);

        Callable<String> c = () -> "done";

        features.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        features.forEach(System.out::println);

    }

    public static void filter(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name)))
                .forEach((name) -> {System.out.println(name + " ");
                });
    }
}
