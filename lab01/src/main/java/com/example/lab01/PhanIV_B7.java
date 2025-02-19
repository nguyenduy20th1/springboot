package com.example.lab01;

import java.util.Scanner;

public class PhanIV_B7 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("Số lớn nhất là: " + a);
            System.out.println("Số nhỏ nhất là: " + b);

        }
        System.out.println("Số lớn nhất là: " + b);
        System.out.println("Số nhỏ nhất là: " + a);
    }
}
