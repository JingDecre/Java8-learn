package com.example.demo;

/**
 * Created by Administrator on 2017/11/10.
 */
public class OuterClassSecond {
    public void display() {
        System.out.println("OuterClass...");
    }

    public class InnerClass {
        //实现外部类的引用
        public OuterClassSecond getOuterClass(){
            return OuterClassSecond.this;
        }
    }

    public static void main(String[] args) {
        OuterClassSecond outerClassSecond = new OuterClassSecond();
        OuterClassSecond.InnerClass innerClass = outerClassSecond.new InnerClass();
        innerClass.getOuterClass().display();
    }
}
