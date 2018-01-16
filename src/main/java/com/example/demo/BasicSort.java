package com.example.demo;

/**
 * Created by decre on 2018/1/16.
 */
public class BasicSort {

    public static void main(String[] args) {

    }

    //冒泡排序
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = arr[i];
                if(arr[i] > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //选择排序
    private static void chooseSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int least = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[least]) {
                    least = j;
                }
            }

            //当前第一个元素与它后面序列中最小的一个元素交换，也就是最小的排前面
            int temp = arr[i];
            arr[i] = arr[least];
            arr[least] = temp;

        }
    }

    //插入排序
    private static void insertionSort(int[] arr) {
        int in, out;
        for (out =1; out < arr.length; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1 ];
                --in;
            }
            arr[in] = temp;
        }
    }
}
