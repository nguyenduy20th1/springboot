package com.example.lab03.phan2;

import java.util.Scanner;

public class b13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        long giaiThua = 1;

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        System.out.println("Giai thừa của " + n + " là: " + giaiThua);

        sc.close();
    }
}
