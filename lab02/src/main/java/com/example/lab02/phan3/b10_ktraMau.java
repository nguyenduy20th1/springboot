package com.example.lab02.phan3;

import java.util.Scanner;

public class b10_ktraMau {
    public static void main(String[] args) {
        char color;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kí tự màu(r, b, g, p): ");
        color = sc.next().charAt(0);
        switch (color) {
            case 'r', 'R':
                System.out.println("RED");
                break;
            case 'b', 'B':
                System.out.println("BLUE");
                break;
            case 'g', 'G':
                System.out.println("GREEN");
                break;
            case 'p', 'P':
                System.out.println("YELLOW");
        }
    }
}
