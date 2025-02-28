package com.example.lab03.phan2;

import java.util.Scanner;

public class b7 {
    int n;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập n (n > 0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Số không hợp lệ! Vui lòng nhập số lớn hơn 0.");
            }
        } while (n <= 0);
    }

    public void hienthi() {
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;

        System.out.println("\nCác số chia hết cho 3:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum1 += i * i;
                sum2 += i;
                count++;
                System.out.print(i + " ");
            }
        }

        double tbc = (count > 0) ? (double) sum2 / count : 0;

        System.out.println("Tổng bình phương các số chia hết cho 3: " + sum1);
        System.out.println("Trung bình cộng các số chia hết cho 3: " + tbc);

        System.out.println("Các số chẵn lớn hơn TBC:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i > tbc) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        b7 obj = new b7();
        obj.nhap();
        obj.hienthi();
    }
}
