package com.example.lab06.phan1;

import java.util.Scanner;

public class BaiThucHanh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]arrSinhVien = new String[3];

        for (int i = 0; i < arrSinhVien.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap sinh vien : ");
            arrSinhVien[i] = sc.nextLine();
        }

        for (String s : arrSinhVien) {
            System.out.println("Tên sinh viên là: " + s);
        }
    }
}
