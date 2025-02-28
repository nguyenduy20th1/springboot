package com.example.lab02.phan3;

import java.util.Scanner;

public class b9_keoBuaBao {
    char KBG;
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lựa chọn của bạn (Kéo - K, Búa - B, Giấy - G): ");
        KBG = sc.next().charAt(0);
    }
    public void hienThi() {
        switch (KBG) {
            case 'K', 'k':
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhập lựa chọn 2 của bạn (Kéo - K, Búa - B, Giấy - G): ");
                KBG = sc.next().charAt(0);
                if (KBG == 'K') {
                    System.out.print("Kéo - Kéo => hòa rồi !");
                } else if (KBG == 'B') {
                    System.out.print("Kéo - Búa => Búa thắng rồi !");
                }
                else {
                    System.out.print("Kéo - Giấy => Kéo thắng rồi !");
                }
                break;
            case 'B', 'b':
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Nhập lựa chọn 2 của bạn (Kéo - K, Búa - B, Giấy - G): ");
                KBG = sc1.next().charAt(0);
                if (KBG == 'B') {
                    System.out.print("Búa - Búa => hòa rồi !");
                } else if (KBG == 'K') {
                    System.out.print("Kéo - Búa => Búa thắng rồi !");
                }
                else {
                    System.out.print("Búa - Giấy => Giấy thắng rồi !");
                }
                break;
            case 'G':
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Nhập lựa chọn 2 của bạn (Kéo - K, Búa - B, Giấy - G): ");
                KBG = sc2.next().charAt(0);
                if (KBG == 'G') {
                    System.out.print("Giấy - Giấy => hòa rồi !");
                } else if (KBG == 'K') {
                    System.out.print("Kéo - Giấy => Kéo thắng rồi !");
                }
                else {
                    System.out.print("Búa - Giấy => Giấy thắng rồi !");
                }
                break;
        }
    }
    public static void main(String[] args) {
        b9_keoBuaBao b = new b9_keoBuaBao();
        b.nhapDL();
        b.hienThi();
    }
}
