package com.example.lab03.phan2;

import java.util.Scanner;


public class b11 {
    public static boolean laSoHoanHao(int j) {
        if (j <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= j / 2; i++) {
            if (j % i == 0) {
                sum += i;
            }
        }
        return sum == j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        System.out.println("Các số hoàn hảo từ 1 đến " + n + " là:");
        for (int j = 1; j <= n; j++) {
            if (laSoHoanHao(j)) {
                System.out.println(j);
            }
        }
        sc.close();
    }
}
