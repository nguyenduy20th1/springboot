package com.example.lab01;

import java.util.Scanner;

public class PhanIV_B6 {
    public static void main(String[] args) {
        int n1;
        int m1;
        float n2;
        float m2;
        float sum;
        int sum1;
        float sum2;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên n1: ");
        n1 = input.nextInt();
        System.out.println("Nhập số nguyên m1: ");
        m1 = input.nextInt();
        System.out.println("Nhập số thực n2: ");
        n2 = input.nextFloat();
        System.out.println("Nhập số thực m2: ");
        m2 = input.nextFloat();

        sum = n1+n2;
        sum1 = n1+m1;
        sum2 = n2+m2;
        System.out.println("Tổng 2 số nguyên là: " + sum1);
        System.out.println("Tổng 2 số thực là: " + sum2);
        System.out.println("Tổng n1 và n2 là: " + sum);
        input.close();
    }
}
