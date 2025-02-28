package com.example.lab03.phan2;

import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {
        int giaithua = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            giaithua = giaithua * i;
        }
        System.out.println(giaithua);
    }
}
