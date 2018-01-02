package com.example.demo;

import java.util.Arrays;
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

    }
}
