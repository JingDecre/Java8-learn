package com.example.demo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by decre on 2018/1/2.
 */
public class Lambda {

    public static void main(String[] args) {
        // new Thread(()-> System.out.println("In java8, Lambda expression orcks !!")).start();
       /* List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
        features.forEach(System.out::println);*/
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        System.out.println("Languages switch start with J:");
        languages.stream().sorted().filter((s) -> s.startsWith("J")).forEach(System.out::println);

        List<Integer> nums = Arrays.asList(100, 200, 300, 400, 100, 200, 300, 500);
        nums.stream().sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);

        nums.stream().distinct().forEach(System.out::println);


        nums.stream().map((num) -> num + .12*num).forEach(System.out::println);
        double bill = nums.stream().map((num) -> num + .12*num).reduce((sum, num) -> sum + num).get();
        System.out.println("Total:" + bill);
    }

}
