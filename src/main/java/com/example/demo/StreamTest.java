package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by decre on 2018/1/2.
 */
public class StreamTest {

    public static void main(String[] args) {
        //数组创建Stream一般通过：Arrays.stream()和Stream.of()
        int [] ints = new int[]{1, 3, 6, 2, 4};
        IntStream intStream = Arrays.stream(ints);
        intStream.forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1,6,5,2,4);
        stream.sorted().forEach(System.out::println);

        //集合创建Stream
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream2 = list.stream();

        //创建并行Stream
        List<Integer> list2 = Arrays.asList(1,3,4,5,2);
        Stream<Integer> stream3 = list2.parallelStream();

        //初始化一个无限重复字符串的Stream
        //Stream.generate(() -> "Hello World!!").forEach(System.out::println);

        //通过limit()来限制创建数据的Stream
        Stream.generate(() -> "Hello world!!!").limit(5).forEach(System.out::println);

        //创建一个从1到10的数列Stream
        //iterate方法的两个参数，第一个为初始数据，第二个为一个Operator接口
        Stream.iterate(1, x->x+1).limit(10).forEach(System.out::println);
    }
}
