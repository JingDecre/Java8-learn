package com.example.demo;

/**
 * Created by decre on 2018/1/8.
 */
public class CustomInterface

{
    public static void main(String[] args) {
        CustomInterface customInterface = new CustomInterface();

        MathOperation mathOperation = (int a, int b) -> a + b;
        MathOperation subOperation = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> a / b;

        System.out.println(" 10 + 5 =" + customInterface.operate(10, 5, mathOperation));
        System.out.println(" 10 - 5 =" + customInterface.operate(10, 5, subOperation));
        System.out.println(" 10 x 5 =" + customInterface.operate(10, 5, multiplication));
        System.out.println(" 10 / 5 =" + customInterface.operate(10, 5, division));

        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        greetingService1.sayMessage("Google");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
