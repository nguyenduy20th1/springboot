package com.example.lab02.phan3;

import java.util.Scanner;

public class b12_diemThi2 {
    int toan;
    int ly;
    int hoa;

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);

        toan = nhapDiem(sc, "toán");
        ly = nhapDiem(sc, "lý");
        hoa = nhapDiem(sc, "hóa");

        sc.close();
    }

    public int nhapDiem(Scanner sc, String mon) {
        int diem;
        do {
            System.out.print("Nhập điểm " + mon + " (0 - 10): ");
            while (!sc.hasNextInt()) {
                System.out.println("Lỗi! Vui lòng nhập số nguyên từ 0 đến 10.");
                sc.next(); // Xóa dữ liệu nhập sai
            }
            diem = sc.nextInt();
        } while (diem < 0 || diem > 10);
        return diem;
    }

    public void kiemTra() {
        int sum = toan + ly + hoa;

        if (sum >= 15 && toan > 3 && ly > 3 && hoa > 3) {
            System.out.println("Đạt");
            if (toan > 5 && ly > 5 && hoa > 5) {
                System.out.println("Học đều tất cả các môn");
            } else {
                System.out.println("Chưa học đều tất cả các môn");
            }
        } else {
            System.out.println("Học lại");
        }
    }

    public static void main(String[] args) {
        b12_diemThi2 obj = new b12_diemThi2();
        obj.nhapDL();
        obj.kiemTra();
    }
}
