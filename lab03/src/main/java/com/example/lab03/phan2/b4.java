package com.example.lab03.phan2;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        double n = sc.nextDouble();
        if (n % 1 == 0) {
            System.out.print("Là số nguyên");
        } else {
            System.out.print("Không là số nguyên");
        }
    }
}
