package com.example.lab02.phan1;

import java.util.Scanner;

public class th1SinhVien {
    String name;
    String address;
    int soLanThi = 0;
    float diemJava = 9.2f;
    double lePhTthi = 1.5;
    char gioiTinh = 'M';

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Nhập số lần thi: ");
        soLanThi = sc.nextInt();
        sc.close();
    }

    public static void main(String[] args) {
        th1SinhVien sinhVienBK = new th1SinhVien();
        sinhVienBK.nhapThongTin();
        System.out.println("Tên sinh viên là: " + sinhVienBK.name);
        System.out.println("Địa chỉ: " + sinhVienBK.address);
        System.out.println("Số lần thi: " + sinhVienBK.soLanThi);
        System.out.println("Số lần thi: " + sinhVienBK.diemJava);
        System.out.println("Lệ phí thi: " + sinhVienBK.lePhTthi);
        System.out.println("Giới tính: " + sinhVienBK.gioiTinh);
    }
}
