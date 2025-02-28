package com.example.lab03.phan2;

import java.util.Scanner;

public class b9 {
    public static void main(String[] args) {
        int status;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Cuối tuần bạn muốn làm gì?");
            System.out.println("1. Đi học Java");
            System.out.println("2. Đi chơi công viên ngắm gấu");
            System.out.println("3. Đi về nhà nghỉ");
            System.out.println("4. Ra sông tắm");
            System.out.println("5. Ngủ cả ngày");
            System.out.println("6. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            status = sc.nextInt();

            switch (status) {
                case 1, 2, 3, 4, 5:
                    System.out.println("Bạn lười quá!");
                    break;
                case 6:
                    System.out.println("Bạn đã chọn thoát! Quay lại menu...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Mời nhập lại.");
            }
        }
    }
}
