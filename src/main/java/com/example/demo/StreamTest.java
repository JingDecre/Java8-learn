package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
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

        //过滤操作,filter
        Arrays.asList("Abc", "aa", "Ab", "op", "IQ").stream().filter(s->Character.isUpperCase(s.charAt(0))).forEach(System.out::println);

        //过滤操作,去重distinct
        Arrays.asList("a", "c","ac","c", "aa", "a").stream().distinct().forEach(System.out::println);

        //变换操作,Map
        Arrays.asList("hadfa", "abc", "adce", "yui").stream().map(s->s.toUpperCase()+",").forEach(System.out::print);

        //变换操作, flatMap 高纬度流变为低纬度流
        String [] str1 = {"a", "b", "c"};
        String [] str2 = {"d", "e", "f"};
        String [] str3 = {"a", "g", "h"};
        Arrays.asList(str1,str2,str3).stream().flatMap(strings -> Stream.of(strings)).map(s -> s+",").forEach(System.out::print);
        System.out.println();
        //拆分合并流操作 limit 返回前面n个元素
        Arrays.asList(1,2,3,4,5).stream().limit(3).forEach(System.out::print);

        System.out.println();
        //拆分合并流操作 skip 跳过Stream前的n个元素
        Arrays.asList(1,3,4,5,7,2,6).stream().skip(2).forEach(System.out::print);

        System.out.println();
        //拆分合并流操作 concat 将两个Stream合并成一个
        Stream<Integer> streamFir = Arrays.asList(1,2,3).stream();
        Stream<String> streamSec = Arrays.asList("a", "b", "c").stream();

        Stream.concat(streamFir, streamSec).forEach(System.out::print);

        //流排序 sorted 无参
        Arrays.asList(3,1,2,5,3,4).stream().sorted().forEach(System.out::println);
        System.out.println();

        //流排序 自定义规则 按照字符长度排序
        Arrays.asList("ae", "f", "gqet","ertyu","zxc").stream().sorted((x,y) -> Integer.compare(x.length(), y.length())).forEach(System.out::println);

        //若两个字符串长度相同，按照字母顺序排列，可以用Comparator的thenComparaimg()
        Arrays.asList("ae", "aa","acf", "baec", "cs", "bg").stream().sorted(
                Comparator.comparing(String::length).thenComparing(String::compareTo)
        ).forEach(System.out::println);

        System.out.println();
        //反序排序Comparator的reversed
        //数字
        Arrays.asList(1,3,4,2,6).stream().sorted(
                Comparator.reverseOrder()
        ).forEach(System.out::print);
        System.out.println();

        //字符串
        Arrays.asList("ae", "cf", "ag", "dec", "run", "caac").stream().sorted(
                Comparator.comparing(String::length).reversed()
        ).forEach(System.out::print);

        System.out.println();
        //parallel().sorted(),不能直接使用forEach，要使用forEachOrdered(),由于parallel是并行操作，所以使用forEach执行时，是随机的
        Arrays.asList(1,3,5,6,2,34,22,73).stream().parallel().sorted().forEach(System.out::println);
        Arrays.asList(1,3,5,6,2,34,22,73).stream().parallel().sorted().forEachOrdered(System.out::println);



    }
}
