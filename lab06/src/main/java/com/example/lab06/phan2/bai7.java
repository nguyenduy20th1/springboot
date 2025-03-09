package com.example.lab06.phan2;

import java.util.Scanner;

public class bai7 {
    public static boolean kiemtra(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
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
                System.out.println(arr[i] + " là số chẵn");
            }
        }
    }
}
