package com.example.lab02.phan3;

import java.util.Scanner;

public class b6_tamGiac {
    int a,b,c;
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập các cạnh của tam giác");
        a = nhapCanh("Nhập cạnh a: ",sc);
        b = nhapCanh("Nhập cạnh b: ",sc);
        c = nhapCanh("Nhập cạnh c: ",sc);
        if (kiemtraTamGiac()) {
            hienThi();
        }
        else {
            System.out.println("3 cạnh không tạo thành 1 tam giác hợp lệ");
        }
    }
    private boolean kiemtraTamGiac() {
        return (a+b>c) && (a+c>b && b+c>a);
    }

    private int nhapCanh(String message, Scanner sc) {
        int canh;
        while (true) {
            System.out.println(message);
            if (sc.hasNextInt()) {
                canh = sc.nextInt();
                if (canh > 0) {
                    break;
                }
                else {
                    System.out.println("Nhập số lớn hơn 0. Nhập lại!");
                }
            }
            else {
                System.out.println("Vui lòng nhập số hợp lệ");
                sc.next();
            }
        }
        return canh;
    }

    public void chuVi() {
        int chuVi = a + b + c;
        System.out.println("Chu vi của tam giác: " + chuVi);
    }

    public void tinhDienTich() {
        double p = (a+b+c)/2;
        double dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Diện tích tam giác: " + dienTich);
    }

    public void hienThi() {
        chuVi();
        tinhDienTich();
    }

    public static void main(String[] args) {
        b6_tamGiac b6 = new b6_tamGiac();
        b6.nhapDL();

    }
}
