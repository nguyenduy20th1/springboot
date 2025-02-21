package com.example.lab02.phan3;

import java.util.Scanner;

public class XeMay {
    String ten;
    String nhaSanXuat;
    int soLuongXe;

    public void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tên xe: ");
        ten = in.nextLine();
        System.out.print("Tên nhà sản xuất: ");
        nhaSanXuat = in.nextLine();
        System.out.print("Số lượng: ");
        soLuongXe = in.nextInt();
    }
    public void hienthiThongTin() {
        System.out.println("Tên xe: " + ten);
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Số lượng: " + soLuongXe);
    }

    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        xeMay.nhapThongTin();
        xeMay.hienthiThongTin();
    }
}
