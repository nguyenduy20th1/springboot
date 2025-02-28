package com.example.lab03.phan1;

import java.util.Scanner;

public class th5 {
    public void docSo(double soThapPhan) {
        int phanNguyen = (int) soThapPhan;  // Lấy phần nguyên
        int phanThapPhan = (int) Math.round((soThapPhan - phanNguyen) * 100); // Lấy 2 số sau dấu phẩy

        System.out.print("Số " + soThapPhan + " đọc là: ");
        docSoNguyen(phanNguyen);  // Đọc phần nguyên

        if (phanThapPhan > 0) {
            System.out.print(" phẩy ");
            docSoNguyen(phanThapPhan);  // Đọc phần thập phân
        }
    }

    public void docSoNguyen(int number) {
        String[] donVi = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] chuc = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi",
                "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

        if (number < 10) {
            System.out.print(donVi[number]);
        } else if (number < 20) {
            if (number == 10) System.out.print("mười");
            else System.out.print("mười " + donVi[number % 10]);
        } else if (number < 100) {
            System.out.print(chuc[number / 10]);
            if (number % 10 != 0) System.out.print(" " + donVi[number % 10]);
        } else {
            System.out.print("Số quá lớn, chưa hỗ trợ!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        th5 obj = new th5();

        System.out.print("Nhập số thập phân: ");
        double so = sc.nextDouble();

        obj.docSo(so);
    }
}
