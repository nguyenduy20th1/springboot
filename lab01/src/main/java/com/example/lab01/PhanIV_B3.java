package com.example.lab01;

import java.util.Scanner;

public class PhanIV_B3 {
    public static void main(String[] args) {
        int soNguyen;
        float soThuc;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        soNguyen = input.nextInt();
        System.out.println("Nhập số thực m:");
        soThuc = input.nextFloat();

        System.out.println("Số nguyên vừa nhập là: " + soNguyen);
        System.out.println("Số thực vừa nhập là: " + soThuc);
    }
}
