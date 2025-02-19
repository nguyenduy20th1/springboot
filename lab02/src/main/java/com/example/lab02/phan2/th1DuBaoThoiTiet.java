package com.example.lab02.phan2;

import java.util.Scanner;

public class th1DuBaoThoiTiet {
    int status;
    public void nhapDuLieu() {
        System.out.println("Chương trình dự báo thời tiết Chuồn Chuồn");
        System.out.println("1. Bay thấp");
        System.out.println("2. Bay cao");
        System.out.println("3. Bay vừa");
        System.out.println("4. Say rượu cmn rồi!");
        System.out.println("Mời nhập từ 1 --> 4: ");

        Scanner sc = new Scanner(System.in);
        status = sc.nextInt();
        System.out.println("Nhập thành công!");
    }
    public void hienthiDuBao() {
        switch (status) {
            case 1:
                System.out.println("Dự báo: Mưa, khi ra khỏi nhà nhớ mang áo mưa");
                break;
            case 2:
                System.out.println("Dự báo: Nắng, nhớ mang ô nhé!");
                break;
            case 3:
                System.out.println("Dự báo: Xinloi, do nhậu say nên chưa trả lời!");
                break;
            case 4:
                System.out.println("Chuồn Chuồn thử *beep* 404 lần nhưng không có kết quả");
                break;
        }
    }
    public static void main(String[] args) {
        th1DuBaoThoiTiet db = new th1DuBaoThoiTiet();
        db.nhapDuLieu();
        db.hienthiDuBao();
    }
}
