package com.example.lab03.phan1;

public class th4 {
    public static void main(String[] args) {
        int count = 0;
        int x = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 > 0) {
                continue;
            }
            count++;
            x += i;
            if (count == 10) {
                break;
            }
            System.out.println(x);
        }
    }
}
