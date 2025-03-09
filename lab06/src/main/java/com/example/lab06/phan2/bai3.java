package com.example.lab06.phan2;

import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + " ";
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
