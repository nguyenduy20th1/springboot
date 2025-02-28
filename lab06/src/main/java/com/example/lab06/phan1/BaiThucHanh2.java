package com.example.lab06.phan1;

import java.util.Scanner;

/**
 * @author Devmaster
 */
public class BaiThucHanh2 {
    String arrNhanVien[][] = new String[3][2];

    public void nhapDl() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println("Nhập hông tin cho nhân viên thứ " + (i + 1));
            Scanner sc = new Scanner(System.in);
            arrNhanVien[i][0] = sc.nextLine();
            arrNhanVien[i][1] = sc.nextLine();
        }
        System.out.println("Thành công!");
    }

    public void sapXep() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            for (int j = i + 1; j < arrNhanVien.length; j++) {

                if(Float.parseFloat(arrNhanVien[j][1]) < Float.parseFloat(arrNhanVien[i][1])) {
                    String temp[][] = new String[1][2];

                    temp[0][0] = arrNhanVien[j][0];
                    temp[0][1] = arrNhanVien[j][1];

                    arrNhanVien[j][0] = arrNhanVien[i][0];
                    arrNhanVien[j][1] = arrNhanVien[i][1];

                    arrNhanVien[i][0] = temp[0][0];
                    arrNhanVien[i][1] = temp[0][1];
                }
            }
        }
    }

    public void hienThi() {
        for (int i = 0; i < arrNhanVien.length; i++) {
            System.out.println(arrNhanVien[i][0] + " - " + arrNhanVien[i][1]);
        }
    }
    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        BaiThucHanh2 obj = new BaiThucHanh2();
        obj.nhapDl();
        obj.sapXep();
        obj.hienThi();
    }
}
