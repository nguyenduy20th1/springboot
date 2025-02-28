package com.example.lab02.phan3;

import java.util.Scanner;

public class b13_tinhLuong {
    float soGio;
    double soLuong;
    double tongLuong;
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giờ làm: ");
        soGio = sc.nextFloat();
        System.out.print("Nhập số lương/giờ: ");
        soLuong = sc.nextFloat();
    }
    public void tinhLuong() {
        if (soGio <= 40) {
            tongLuong = soLuong * soGio;
        }
        else {
            tongLuong = (soLuong * 40) + ((soGio - 40) * (soLuong * 1.5));
        }
        System.out.println("Tổng lương: " + tongLuong);
    }
    public static void main(String[] args) {
        b13_tinhLuong t = new b13_tinhLuong();
        t.nhapDL();
        t.tinhLuong();
    }
}
