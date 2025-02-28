package com.example.lab03.phan2;

import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chiều cd: ");
        int cd = sc.nextInt();
        System.out.print("nhập chiều cr: ");
        int cr = sc.nextInt();

        for (int i = 1; i <= cd; i++) {
            for (int j = 0; j <= cr; j++) {
                if (j == 0 || j == cr || i == cd || i == 1) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
