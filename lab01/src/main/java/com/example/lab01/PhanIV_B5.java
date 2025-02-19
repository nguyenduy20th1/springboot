package com.example.lab01;

import java.util.Scanner;

public class PhanIV_B5 {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = input.nextInt();
        System.out.println("Nhập b: ");
        b = input.nextInt();

        sum = a+b;
        System.out.println("Tổng a và b là: " + sum);
        input.close();
    }
}
