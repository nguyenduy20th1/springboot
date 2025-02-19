package com.example.lab01;

import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        String tenSinhVien;
        int tuoi;
        float diemThiLyThuyet;
        float diemThiThucHanh;

        Scanner input = new Scanner(System.in);
        System.out.print("Sinh viên: ");
        tenSinhVien = input.nextLine();
        System.out.print("Tuổi : ");
        tuoi = input.nextInt();
        System.out.print("Điểm thi lý thuyết: ");
        diemThiLyThuyet = input.nextFloat();
        System.out.print("Điểm thi thực hành: ");
        diemThiThucHanh = input.nextFloat();

        float diemTrungBinh = (diemThiLyThuyet+diemThiThucHanh)/2;
        System.out.println("Chào bạn: " + tenSinhVien + " - " + tuoi + " tuổi");
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }
}
