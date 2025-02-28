package com.example.lab03.phan2;

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println("Tổng từ 1 đến " + n + " là: " + sum);
    }
}
