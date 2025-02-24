package org.example.lab04.phan1;

public class th1_Customer {
    int id;
    String name;
    String address;
    int age;
    double salary;

    void input() {

    }

    void viewData() {

    }

    double calSalary(int bonus) {
        return salary + salary * (bonus/100);
    }
    double calBonus(double bonus) {
        return salary + bonus;
    }
}

