package com.example.lab02.phan3;

import java.util.Scanner;

public class b11_tinhToan {
    int a, b;
    int total;
    char status;
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = sc.nextInt();
        System.out.print("Nhập số b: ");
        b = sc.nextInt();
        System.out.print("Lựa chon phép tính: ");
        status = sc.next().charAt(0);
        sc.close();
    }
    public void hienThi() {
        switch (status) {
            case '+':
                total = a + b;
                System.out.print(a + " + " + b + " = " + total);
                break;
            case '-':
                total = a - b;
                System.out.print(a + " - " + b + " = " + total);
                break;
            case '*':
                total = a * b;
                System.out.print(a + " * " + b + " = " + total);
                break;
            case '/':
                total = a / b;
                System.out.print(a + " / " + b + " = " + total);
        }
    }

    public static void main(String[] args) {
        b11_tinhToan obj = new b11_tinhToan();
        obj.nhapDL();
        obj.hienThi();
    }
}
