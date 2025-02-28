package com.example.demo.phan1;

import java.util.Scanner;

public class ConvertTemperature {
    private float tempNum;

    private float convertC2F() {
        return (float) (tempNum * 1.8 + 32);
    }
    private float convertF2C() {
        return (float) ((tempNum - 32) / 1.8);
    }

    public void convert(float nhietDo, boolean isToC) {
        this.tempNum = nhietDo;
        if (isToC) {
            System.out.println("Nhiệt độ " + nhietDo + "C = " + convertC2F() + "F");
        }
        else {
            System.out.println("Nhiệt độ " + nhietDo + "C = " + convertF2C() + "F");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập nhiệt độ cần chuyển đổi: ");
        Scanner sc = new Scanner(System.in);
        float nhietDo = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhiệt độ bạn vừa nhập là: (C hoặc F)");
        char type = sc.nextLine().charAt(0);
        ConvertTemperature ct = new ConvertTemperature();
        switch (type) {
            case 'C':
                ct.convert(nhietDo, true);
                break;
            case 'F':
                ct.convert(nhietDo, false);
                break;
        }
    }
}
