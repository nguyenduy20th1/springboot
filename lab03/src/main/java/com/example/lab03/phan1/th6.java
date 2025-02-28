package com.example.lab03.phan1;

import java.util.ArrayList;
import java.util.Scanner;

class SinhVien {
    String hoTen;
    int tuoi;
    double diemTB;

    public SinhVien(String hoTen, int tuoi, double diemTB) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public void hienThi() {
        System.out.println("Tên: " + hoTen + ", Tuổi: " + tuoi + ", Điểm TB: " + diemTB);
    }
}

public class th6 {
    int status;
    ArrayList<SinhVien> danhSachSV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapDL() {
        while (true) {
            System.out.println("============ MENU =============");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Sinh viên xuất sắc");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn: ");

            status = sc.nextInt();
            sc.nextLine();  // Xóa bộ đệm nhập

            switch (status) {
                case 1:
                    nhapThongTin();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    timKiemSinhVien();
                    break;
                case 4:
                    sinhVienXuatSac();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        }
    }

    public void nhapThongTin() {
        System.out.print("Nhập họ tên sinh viên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();
        sc.nextLine();  // Xóa bộ đệm nhập

        danhSachSV.add(new SinhVien(hoTen, tuoi, diemTB));
        System.out.println("Thêm sinh viên thành công!");
    }

    public void hienThiDanhSach() {
        if (danhSachSV.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("==== Danh sách sinh viên ====");
            for (SinhVien sv : danhSachSV) {
                sv.hienThi();
            }
        }
    }

    public void timKiemSinhVien() {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String tenTimKiem = sc.nextLine();
        boolean found = false;
        for (SinhVien sv : danhSachSV) {
            if (sv.hoTen.equalsIgnoreCase(tenTimKiem)) {
                sv.hienThi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }

    public void sinhVienXuatSac() {
        System.out.println("Danh sách sinh viên xuất sắc (điểm >= 9.0):");
        boolean found = false;
        for (SinhVien sv : danhSachSV) {
            if (sv.diemTB >= 9.0) {
                sv.hienThi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có sinh viên xuất sắc.");
        }
    }

    public static void main(String[] args) {
        th6 app = new th6();
        app.nhapDL();
    }
}
