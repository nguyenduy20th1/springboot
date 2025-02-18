package com.devmaster.lesson01.pgk_lambda_expression;

import java.util.Arrays;

@FunctionalInterface
interface ExecuteFunction {
    int execute(int a, int b);
}


class MathUtils {
    public MathUtils() {}
    public MathUtils(String str) {
        System.out.println("MathUtils: " + str);
    }
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int minus (int a, int b) {
        return a - b;
    }
    public static int multiply (int a, int b) {
        return a * b;
    }
}

public class LambdaExpression6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = doAction(a,b,MathUtils::sum);
        System.out.println(a + "+" + b + "=" + sum);
        int minus = MathUtils.minus(a, b);
        System.out.println(a + "-" + b + "=" + minus);

        MathUtils mathUtils = new MathUtils();
        int multiply = MathUtils.multiply(a, b);
        System.out.println(multiply + "*" + a + "=" + multiply);

        String[] stringArray = {"one", "two", "three"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}
