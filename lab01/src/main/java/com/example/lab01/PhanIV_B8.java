package com.example.lab01;

import java.util.Scanner;

public class PhanIV_B8 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b: ");
        b = sc.nextInt();
        System.out.println("Nhập số c: ");
        c = sc.nextInt();

        int max = a;
        if (b > a) {
            max = b;
        }
        else if (c > b) {
            max = c;
        }
        System.out.println("Số lớn nhất là: " + max);

        int min = a;
        if (b < a) {
            min = b;
        }
        else if (c < b) {
            min = c;
        }
        System.out.println("Số nhỏ nhất là: " + min);
        sc.close();
    }
}
