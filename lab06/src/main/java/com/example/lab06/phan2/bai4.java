package com.example.lab06.phan2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap cac phan tu: ");
            arr[i] = sc.nextInt();
        }

        int temp;
        for (int a = 0; a < arr.length; a++) {
            for (int b = a + 1; b < arr.length; b++) {
                if (arr[a] > arr[b]) {
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }
            }
        }
        System.out.println("Min: " + arr[0]);
        System.out.println("Max: " + arr[arr.length - 1]);
    }
}