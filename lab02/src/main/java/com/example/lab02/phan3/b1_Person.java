package com.example.lab02.phan3;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Địa chỉ: ");
        address = sc.nextLine();
        System.out.print("Lương: ");
        salary = sc.nextDouble();
    }
    public void view() {
        System.out.println("Tên của bạn là: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Lương: " + salary);
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.input();
        p.view();
    }
}
