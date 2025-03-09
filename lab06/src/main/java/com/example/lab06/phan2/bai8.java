package com.example.lab06.phan2;

import java.util.Arrays;
import java.util.Scanner;

public class bai8 {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        bai8 b = new bai8();
        b.nhapMang();
    }
}
