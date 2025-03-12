package com.example.lab06.phan2;

import java.util.Arrays;
import java.util.Scanner;

public class bai10 {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] arr;
    public void nhapMang() {
        System.out.println("nhap so n: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap cac so nguyen: ");
            arr[i] = sc.nextInt();
        }

        kiemtra(arr);

        System.out.println("mang sau khi sap xep la: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void kiemtra(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        bai10 b = new bai10();
        b.nhapMang();
    }
}
