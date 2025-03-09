package com.example.lab06.phan2;

import java.util.Random;

public class bai2 {
    public static void main(String[] args) {
        String[] arr = new String[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + " ";
        }
        System.out.println("Số ngẫu nhiên là: ");
        for (String s : arr) {
            System.out.println(s + " ");
        }
    }
}
