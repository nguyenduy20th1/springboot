package org.example.lab04.phan2;

import java.util.Scanner;

public class HoaDonBanhMy {
    int mahd;
    String date;
    String name;
    String address;
    int quantity;
    double price;
    double tienhang;
    double sale;
    double thanhtoan;

    void product(int mahd, String date, String name, String address, int quantity, double price) {
        this.mahd = mahd;
        this.date = date;
        this.name = name;
        this.address = address;
        this.quantity = quantity;
        this.price = price;
    }

    void inputHoaDonBanhMy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã hóa đơn: ");
        mahd = sc.nextInt();
        sc.nextLine();
        System.out.print("Ngày: ");
        date = sc.nextLine();
        System.out.print("Tên Khách hàng: ");
        name = sc.nextLine();
        System.out.print("Địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Số lượng bánh cần giao: ");
        quantity = sc.nextInt();
        System.out.print("Giá bán 1 chiếc bánh: ");
        price = sc.nextDouble();
    }

    void viewHoaDonBanhMy() {
        System.out.println("========= Hóa đơn ==========");
        System.out.println("Mã hóa đơn: " + mahd);
        System.out.println("Ngày: " + date);
        System.out.println("Tên Khách hàng: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Số lượng bánh cần giao: " + quantity);
        System.out.printf("Giá bán 1 chiếc: %,.0f VND", price);
        System.out.println(" ");
        System.out.printf("Khuyến mãi: %d%%", (int) sale);
        System.out.println(" ");
        System.out.printf("Tiền hàng: %,.0f VND", tienhang);
        System.out.println(" ");
        System.out.printf("Thanh toán: %,.0f VND", thanhtoan);
    }

    public void KhuyenMai() {
        tienhang = quantity * price;
        if (quantity >= 100) {
            sale = 20;
            thanhtoan = tienhang * (1 - sale / 100.0);
        } else if (quantity >= 10) {
            sale = 10;
            thanhtoan = quantity * (price*(1 - sale / 100.0));
        } else {
            sale = 0;
            thanhtoan = tienhang;
        }
    }

    public static void main(String[] args) {
        HoaDonBanhMy obj = new HoaDonBanhMy();
        obj.inputHoaDonBanhMy();
        obj.KhuyenMai();
        obj.viewHoaDonBanhMy();
    }
}
