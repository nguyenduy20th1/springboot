package com.example.lab02.phan3;

import java.util.Scanner;

public class b14_tinhGiaDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chỉ số cũ và mới
        System.out.print("Nhập chỉ số điện cũ: ");
        int chiSoCu = sc.nextInt();
        System.out.print("Nhập chỉ số điện mới: ");
        int chiSoMoi = sc.nextInt();

        // Kiểm tra chỉ số hợp lệ
        if (chiSoMoi < chiSoCu) {
            System.out.println("Lỗi: Chỉ số mới không được nhỏ hơn chỉ số cũ.");
            return;
        }

        // Tính số kWh tiêu thụ
        int soDienTieuThu = chiSoMoi - chiSoCu;
        int soDienVuotDinhMuc = Math.max(0, soDienTieuThu - 50); // Phần điện vượt định mức

        // Tính tiền điện theo định mức và vượt định mức
        int tienDinhMuc = Math.min(soDienTieuThu, 50) * 230;
        int tienVuotDinhMuc = 0;

        if (soDienVuotDinhMuc > 0) {
            if (soDienVuotDinhMuc <= 50) {
                tienVuotDinhMuc = soDienVuotDinhMuc * 480;
            } else if (soDienVuotDinhMuc <= 100) {
                tienVuotDinhMuc = (50 * 480) + ((soDienVuotDinhMuc - 50) * 700);
            } else {
                tienVuotDinhMuc = (50 * 480) + (50 * 700) + ((soDienVuotDinhMuc - 100) * 900);
            }
        }

        // Tổng tiền phải trả
        int tongTien = tienDinhMuc + tienVuotDinhMuc;

        // Xuất kết quả
        System.out.println("\n========== HÓA ĐƠN TIỀN ĐIỆN ==========");
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Số điện tiêu thụ: " + soDienTieuThu + " kWh");
        System.out.println("Tiền trả định mức: " + tienDinhMuc + " đ");
        System.out.println("Tiền trả vượt định mức: " + tienVuotDinhMuc + " đ");
        System.out.println("TỔNG TIỀN PHẢI TRẢ: " + tongTien + " đ");

        sc.close();
    }
}
