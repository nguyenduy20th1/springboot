package com.example.lab01;

import java.util.Scanner;

public class PhanIV_B4 {
    public static void main(String[] args) {
        int soNguyen;
        float soThuc;
        String text;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        soNguyen = input.nextInt();
        System.out.println("Nhập số thực m:");
        soThuc = input.nextFloat();
        input.nextLine();
        System.out.println("Nhập chuỗi kí tự: ");
        text = input.nextLine();

        System.out.println("Số nguyên vừa nhập là: " + soNguyen);
        System.out.println("Số thực vừa nhập là: " + soThuc);
        System.out.println("Chuỗi kí tự vừa nhập: " + text);
    }
}
