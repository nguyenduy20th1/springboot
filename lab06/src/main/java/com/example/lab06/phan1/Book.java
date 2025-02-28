package com.example.lab06.phan1;

import java.util.Scanner;

/**
 * @author Devmaster
 */
public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private int numOfPages;
    private float price;

    public void nhapDuLieu() {
        System.out.println("Nhap du lieu cho sach");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten sach: ");
        bookName = sc.nextLine();
        System.out.println("Nha xuat ban: ");
        nxb = sc.nextLine();
        System.out.println("Nam xuat ban: ");
        yearOfPublish = sc.nextInt();
        sc.nextLine();
        System.out.println("Tac gia: ");
        author = sc.nextLine();
        System.out.println("So trang: ");
        numOfPages = sc.nextInt();
        sc.nextLine();
        System.out.println("Gia: ");
        price = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Book{" + " bookName= " + bookName + ", nxb" + nxb + "," +
                " yearOfPublish = " + yearOfPublish + ", author = " + author +
                ", numOfPages = " + numOfPages + ", price = " + price + '}';
    }
}
