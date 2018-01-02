package com.example.demo;

/**
 * Created by Administrator on 2017/11/10.
 */
public class OuterClass {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public class InnerClass {
        public InnerClass() {
            name = "decre";
            age = 24;
        }

        public void  display() {
            System.out.println("name: " + getName() + ", age: " + getAge() );
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
    }

}
