package com.devmaster.lesson01.pgk_lambda_expression;

interface SayHello2 {
    public void sayHello2(String name);
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        SayHello2 say1 = (name) -> {
            System.out.println("Hello " + name);
        };
        say1.sayHello2("World1");
        SayHello2 say2 = name -> {
            System.out.println("Hello " + name);
        };
        say2.sayHello2("World2");
        SayHello2 say3 = name -> System.out.println("Hello " + name);
        say3.sayHello2("World3");
    }
}
