package com.example.lab02.phan1;

import java.util.Scanner;

public class th2SimpleCalculator {
    public void tinhTong() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();
        System.out.println("Kết quả: " + a + " + " + b + " = " + (a + b));
    }
    public static void main(String[] args) {
        th2SimpleCalculator maytinh = new th2SimpleCalculator();
        maytinh.tinhTong();
    }
}
