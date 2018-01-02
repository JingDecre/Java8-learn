package com.example.demo;

/**
 * Created by Administrator on 2017/11/10.
 */
public class OuterClassThird {

    private String str;

    public void outerDisplay() {
        System.out.println("outerClass");;
    }

    public class InnerClass {
        public void innerDisplay() {
            //使用外围属性
            str = "decre...";
            System.out.println(str);
            //使用外围方法
            outerDisplay();
        }
    }

    /*推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时 */
    public InnerClass getInnerClass() {
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClassThird outer = new OuterClassThird();
        //声明要用大写
        OuterClassThird.InnerClass innerClass = outer.getInnerClass();

        innerClass.innerDisplay();
    }
}
