package com.example.lab03.phan2;

import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int a = 1, b = 1;
        System.out.print("Dãy fibonacci từ 1 đến " + n + " là: ");
        if (n >= 1) {
            System.out.print(a + " ");
        }
        while (n >= b) {
            System.out.print(b + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
