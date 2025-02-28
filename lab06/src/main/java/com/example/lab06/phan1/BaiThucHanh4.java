package com.example.lab06.phan1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Devmaster
 */
public class BaiThucHanh4 {
    ArrayList<Book> IstBook = new ArrayList<>();
    public int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Nhap du lieu");
        System.out.println("2. Hien thi danh sach");
        System.out.println("3. Xoa");
        System.out.println("4. Thoat");
        System.out.println("Vui long nhap tu 1 -> 4");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void nhapDuLieu() {
        System.out.println("So sach muon nhap?");
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            System.out.println("Nhap cuon thu " + (i+1));
            Book book = new Book();
            book.nhapDuLieu();
            IstBook.add(book);
        }
        System.out.println("Thanh cong");
    }

    public void hienThiDanhSach() {
        System.out.println("So sach trong thu vien: ");
        for (int i = 0; i < IstBook.size(); i++) {
            Book book = IstBook.get(i);
            System.err.println((i+1) + ". " + book.toString());
        }
        System.out.println("-----------------------------");
    }

    public void xoaSach() {
        System.out.println("Nhap so thu tu muon xoa");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        if (id < IstBook.size() && id >= 0) {
            IstBook.remove(id);
        }
        System.out.println("Xoa thanh cong");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choose;
        BaiThucHanh4 obj = new BaiThucHanh4();
        do {
            choose = obj.showMenu();
            switch (choose) {
                case 1:
                    obj.nhapDuLieu();
                    break;
                case 2:
                    obj.hienThiDanhSach();
                    break;
                case 3:
                    obj.xoaSach();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}
