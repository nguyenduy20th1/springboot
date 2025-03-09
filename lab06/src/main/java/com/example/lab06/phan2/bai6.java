package com.example.lab06.phan2;

import java.util.Scanner;

public class bai6 {
    public static boolean kiemtra(int n) {
        if (n < 2) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap so muon ktra: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (kiemtra(arr[i])) {
                System.out.println(arr[i] + " là số hoàn hảo");
            }
        }
    }
}
