package com.example.lab02.phan3;

import java.util.Scanner;

public class b4_GiaiPTb2 {
    int a, b, c;
    double delta;
    public void nhapDuLieu() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        System.out.print("Nhập c: ");
        c = sc.nextInt();
        delta = (b*b) - (4*a*c);
    }
    public void hienThi() {
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        }
        else if (delta == 0) {
            double x = (-b)/(2*a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x);
        }
        else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
    }
    public static void main(String[] args) {
        b4_GiaiPTb2 b4 = new b4_GiaiPTb2();
        b4.nhapDuLieu();
        b4.hienThi();
    }
}
