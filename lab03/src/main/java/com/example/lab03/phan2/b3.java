package com.example.lab03.phan2;

import java.util.Scanner;

public class b3 {
    int a, b;
    public void nhapSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();
    }
    public void ketqua() {
        int x = a, y = b;
        while (x != y) {
            if (x > y) {
                x -= y;
            }else {
                y -= x;
            }
        }
        int ucln = x;
        int bcnn = (a*b)/ucln;

        System.out.println(ucln);
        System.out.println(bcnn);
    }

    public static void main(String[] args) {
        b3 b3 = new b3();
        b3.nhapSo();
        b3.ketqua();
    }
}
