package com.example.lab02.phan1;

import java.util.Scanner;

public class th3PhuongTrinhb1 {
    int a, b;

    public void nhapDuLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        sc.close();
    }

    public void giaiPT() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = - (double) b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }

    public static void main(String[] args) {
        th3PhuongTrinhb1 pt = new th3PhuongTrinhb1();
        pt.nhapDuLieu();
        pt.giaiPT();
    }
}
