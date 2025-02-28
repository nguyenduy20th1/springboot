package com.example.lab02.phan3;

import java.util.Scanner;

public class b5_chanLe {
    int n;
    public void nhapSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số N: ");
        n = sc.nextInt();
    }
    public void ketQuaThi() {
        if (n % 2 == 0) {
            System.out.println("N là số chẵn");
        }
        else {
            System.out.println("N là số lẻ");
        }
    }
    public static void main(String[] args) {
        b5_chanLe obj = new b5_chanLe();
        obj.nhapSo();
        obj.ketQuaThi();
    }
}
