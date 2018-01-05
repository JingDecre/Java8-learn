package com.example.demo;

import com.example.entity.AttHoliday;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by decre on 2018/1/5.
 */
public class TestStremMap {

    private enum Status {
    };

    public static void main(String[] args) {
        Collection<AttHoliday> attHolidays = Arrays.asList(
                new AttHoliday(1, "1", "aaa"),
                new AttHoliday(2,"2","bbbb"),
                new AttHoliday(3, "3","ccc"),
                new AttHoliday(1, "11", "aaab"),
                new AttHoliday(2,"22","bbbc")
        );

    }
}
