package com.example.lab02.phan3;

import java.util.Scanner;

public class b8_nhapThang {
    int thang;
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng bạn muốn biết: ");
        thang = sc.nextInt();
    }
    public void hienThi() {
        int nam;
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.print("Tháng " + thang + " có: 30 ngày");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11 ) {
            System.out.print("Tháng " + thang + " có: 31 ngày");
        } else if (thang == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập năm: ");
            nam = sc.nextInt();
            if (nam % 4 == 0) {
                System.out.print("Tháng 2 năm nay nhuận nên có: 29 ngày");
            }
            else {
                System.out.print("Tháng 2 có: 28 ngày");
            }
        }
        else {
            System.out.print("Một năm chỉ có 12 tháng thôi!");
        }
    }

    public static void main(String[] args) {
        b8_nhapThang obj = new b8_nhapThang();
        obj.nhapDL();
        obj.hienThi();
    }
}
