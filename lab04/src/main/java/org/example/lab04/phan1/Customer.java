package org.example.lab04.phan1;

import java.util.Scanner;

public class Customer {
    int id;
    String name;
    String address;
    int age;
    double salary;

    void inputCustomerData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Xóa bộ nhớ đệm

        System.out.print("Nhập Tên: ");
        name = sc.nextLine();

        System.out.print("Nhập Địa chỉ: ");
        address = sc.nextLine();

        System.out.print("Nhập Tuổi: ");
        age = sc.nextInt();
        sc.nextLine(); // Xóa bộ nhớ đệm

        System.out.print("Nhập Lương: ");
        salary = sc.nextDouble();
    }

    void viewData() {
        System.out.println("Customer { id = " + id + ", name = " + name +
                ", address = " + address + ", age = " + age + ", salary = " + salary + " }");
    }

    double calSalary(int bonus) {
        return salary + salary * (bonus / 100.0);
    }

    double calBonus(double bonus) {
        return salary + bonus;
    }

    void input(int id, String name, String address, int age, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }
}

class CustomerManager {
    Customer globalCus = new Customer();

    void inputCustomer() {
        globalCus.inputCustomerData();
    }
}

class Main {
    public static void main(String[] args) {
        Customer cust_1 = new Customer();
        Customer cust_2 = new Customer();

        System.out.println("Nhập dữ liệu nhân viên 1:");
        cust_1.inputCustomerData();

        System.out.println("Nhập dữ liệu nhân viên 2:");
        cust_2.inputCustomerData();

        System.out.println("Dữ liệu nhân viên:");
        cust_1.viewData();
        cust_2.viewData();

        System.out.printf("Tiền lương nhân viên 1 (thưởng 15%%): %.0f\n", cust_1.calSalary(15));
        System.out.printf("Tiền lương nhân viên 2 (thưởng 690000đ): %.0f\n", cust_2.calBonus(690000));

        CustomerManager manager = new CustomerManager();
        manager.inputCustomer();
    }
}
