package com.devmaster.lesson01.pgk_lambda_expression;

interface  SayHello {
    void sayHello();
}

public class LambdaExpression1 {
    public static void main(String[] args) {
        SayHello sayHello = () -> {
            System.out.println("Hello World");
        };
        sayHello.sayHello();
    }
}
