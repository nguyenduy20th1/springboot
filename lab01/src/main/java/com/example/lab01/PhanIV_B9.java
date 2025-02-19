package com.example.lab01;

import java.util.Scanner;

public class PhanIV_B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = sc.nextDouble();
        System.out.println("nhập b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            }
            else {
                System.out.println("Phương trình có vô nghiệm");
            }
        } else {
            double c = -b / a;
            System.out.println("Phương trình có nghiệm là = " + c);
        }
    }
}
