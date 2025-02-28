package com.example.lab02.phan3;

import java.util.Scanner;

public class b7_soNLonNhat {
    int a, b, c, d;
    public void nhapSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();
        System.out.print("Nhập số c: ");
        c = sc.nextInt();
        System.out.print("Nhập số d: ");
        d = sc.nextInt();
    }
    public void hienThi() {
        int x;
        int y;
        if (a > b) {
            x = a;
        }
        else {
            x = b;
        }
        if (c > d) {
            y = c;
        }
        else {
            y = d;
        }
        if (x > y) {
            System.out.println("Số lớn nhất là: " + x);
        }
        else {
            System.out.println("Số lớn nhất là: " + y);
        }
    }

    public static void main(String[] args) {
        b7_soNLonNhat obj = new b7_soNLonNhat();
        obj.nhapSo();
        obj.hienThi();
    }
}
