package com.example.demo.phan2.vietnam;

import com.example.demo.phan2.product.Product;
import com.example.demo.phan2.thailand.ThaiLandImportPrice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GeneralManager {
    private ArrayList<VietNamImportPrice> vietnamList = new ArrayList<>();
    private ArrayList<ThaiLandImportPrice> thailandList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void input() {

    }

    public void inputVietNam() {
        System.out.print("Nhập số lượng sản phẩm nhập vào Việt Nam: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ: " + (i+1) + ": ");
            VietNamImportPrice v = new VietNamImportPrice();
            v.input();
            vietnamList.add(v);
        }
    }
    public void displayVietNam() {
        System.out.println("===== DANH SÁCH SẢN PHẨM NHẬP KHẨU =====");
        for (VietNamImportPrice v : vietnamList) {
            v.display();
            System.out.println("---------------------------------");
        }
    }

    public void inputThaiLan() {
        System.out.print("Nhập số lượng sản phẩm nhập vào Thái lan: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ: " + (i+1) + ": ");
            ThaiLandImportPrice tl = new ThaiLandImportPrice();
            tl.input();
            thailandList.add(tl);
        }
    }
    public void displayThaiLan() {
        System.out.println("===== DANH SÁCH SẢN PHẨM NHẬP KHẨU =====");
        for (ThaiLandImportPrice tl : thailandList) {
            tl.display();
            System.out.println("---------------------------------");
        }
    }

    public void displayAll() {
        System.out.println("===== DANH SÁCH SẢN PHẨM NHẬP KHẨU =====");
        for (VietNamImportPrice v : vietnamList) {
            v.display();
            System.out.println("---------------------------------");
        }
        for (ThaiLandImportPrice tl : thailandList) {
            tl.display();
            System.out.println("---------------------------------");
        }
    }

    public void run() {
        while (true) {
            System.out.println("===== QUẢN LÝ SẢN PHẨM NHẬP KHẨU =====");
            System.out.println("1. Nhập sản phẩm");
            System.out.println("2. Nhập sản phẩm từ Viêt Nam");
            System.out.println("3. Nhập sản phẩm từ Thái Lan");
            System.out.println("4. Hiển thị danh sách sản phẩm Việt Nam");
            System.out.println("5. Hiển thị danh sách sản phẩm Thái Lan");
            System.out.println("6. Hiển thị danh sách sản phẩm tất cả");
            System.out.println("7. Thoát");
            System.out.println("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    inputVietNam();
                    break;
                case 3:
                    inputThaiLan();
                    break;
                case 4:
                    displayVietNam();
                    break;
                case 5:
                    displayThaiLan();
                    break;
                case 6:
                    displayAll();
                    break;
                case 7:
                    System.out.println("Thoát chương trình");
                    return;
            }
        }
    }
}
