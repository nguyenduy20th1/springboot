package com.example.lab02.phan3;

import java.util.Scanner;

public class b3_diemThi {
    String ten;
    float diemLT;
    float diemTH;
    public void nhapDiemThi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên thí sinh: ");
        ten = sc.nextLine();
        System.out.println("Nhập điểm thi lý thuyết: ");
        diemLT = sc.nextFloat();
        System.out.println("Nhập điểm thi thực hành: ");
        diemTH = sc.nextFloat();
    }
    public void ketQuaThi() {
        System.out.print("Tên thí sinh: " + ten);
        System.out.println("Điểm thi lý thuyết: " + diemLT);
        System.out.println("Điểm thi thực hành: " + diemTH);
        System.out.print("Kết quả: ");

        float diemTB = (diemLT + diemTH)/2;
        if (diemLT < 4 && diemTH < 4) {
            System.out.println("Học lại");
        }
        else if (diemTH < 4) {
            System.out.println("Học lại thực hành!");
        }
        else if (diemLT < 4) {
            System.out.println("Học lại lý thuyết!");
        }
        else if (diemTB >= 4 && diemTH <= 7) {
            System.out.println("Sinh viên đạt môn Java");
        }
        else if (diemTB > 7) {
            System.out.println("Sinh viên xuất sắc môn Java");
        }
    }
    public static void main(String[] args) {
        b3_diemThi d = new b3_diemThi();
        d.nhapDiemThi();
        d.ketQuaThi();
    }
}
