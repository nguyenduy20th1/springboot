package com.example.lab06.phan2;

import java.util.Scanner;

public class bai5 {
    public static Boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    public void kiemTra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap so ban muon kiem tra: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Cac so nguyen to la: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " ");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        bai5 b = new bai5();
        b.kiemTra();
    }
}
