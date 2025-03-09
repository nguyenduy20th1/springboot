package com.example.lab06.phan2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so: ");
            arr[i] = sc.nextLine();
        }
        for (String s : arr) {
            System.out.println(" " + s);
        }
    }
}
