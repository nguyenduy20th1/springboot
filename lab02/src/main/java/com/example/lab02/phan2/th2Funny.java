package com.example.lab02.phan2;

import java.util.Scanner;

public class th2Funny {
    private Scanner sc = new Scanner(System.in);

    public void thayGiai() {
        System.out.println("Thấy gái! Đánh giá: ");
        System.out.println("1. Xinh");
        System.out.println("2. Xấu");
        System.out.print("Bạn chọn: ");
        int danhGia = sc.nextInt();

        switch (danhGia) {
            case 1:
                gaiXinh();
                break;
            case 2:
                gaiXau();
                break;
        }
    }
    public void gaiXinh() {
        System.out.println("Kiểm tra tình trạng quan hệ: ");
        System.out.println("1. Có người yêu");
        System.out.println("2. Độc thân");
        System.out.print("Bạn chọn: ");
        int tinhTrang = sc.nextInt();

        switch (tinhTrang) {
            case 1:
                tanBanTrai();
                break;
            case 2:
                diChoi();
                break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Nhập lại đi bạn ơi.");
        }
    }

    public void tanBanTrai() {
        System.out.print("Có muốn tán người yêu bạn gái này không? Y/N");
        char choice = sc.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.println("Bạn quyết định tán luôn bạn trai cô ấy! Plot twist cực mạnh!");
        }
        else {
            System.out.println("Đành nhìn cô ấy đi bên người khác");
        }
    }

    public void diChoi() {
        System.out.print("Bạn có muốn đi chơi với cô ấy không? Y/N");
        char choice = sc.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.println("Chúc bạn hẹn hò vui vẻ!");
        }
        else {
            System.out.println("Bạn đã bỏ lỡ cơ hội đi chơi cùng cô ấy!");
        }
    }

    public void gaiXau() {
        System.out.println("Kiểm tra điều kiện gia đình nhà cô ấy");
        System.out.println("1. Nhà mặt phố bố làm to!");
        System.out.println("2. Bình thường");
        System.out.print("Bạn chọn: ");
        int dieuKien = sc.nextInt();

        switch (dieuKien) {
            case 1:
                System.out.println("Tình yêu không biên giới! Tán ngay!");
                diChoi();
            case 2:
                System.out.println("Chuyển sang thằng cùng phòng cho nó xử lý");
                break;
            default:
                System.out.println("Lựa chọn chưa hợp lệ");
                break;
        }
    }
    public static void main(String[] args) {
        th2Funny th2Funny = new th2Funny();
        th2Funny.thayGiai();
    }
}
