package com.example.lab03.phan2;

import java.util.Scanner;

public class b10 {
    public static boolean laSoHoanHao(int n) {
        if (n <= 1) return false;

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int n = sc.nextInt();

        if (laSoHoanHao(n)) {
            System.out.println(n + " là số hoàn hảo.");
        } else {
            System.out.println(n + " không phải là số hoàn hảo.");
        }
    }
}
