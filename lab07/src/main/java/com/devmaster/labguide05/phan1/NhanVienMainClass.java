package com.devmaster.labguide05.phan1;

public class NhanVienMainClass {
    /**
     * @author Devmaster
     */
    public static class Nhanvien {
        String name;
        static int cnt; //biến đếm số lượng nhân viên
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nhanvien[] arrNhanvien = new Nhanvien[3];

        arrNhanvien[0] = new Nhanvien();
        arrNhanvien[0].name = "Ngoc Trinh";
        arrNhanvien[0].cnt++;

        arrNhanvien[1] = new Nhanvien();
        arrNhanvien[1].name = "Ngoc Trinh2";
        arrNhanvien[1].cnt++;

        arrNhanvien[2] = new Nhanvien();
        arrNhanvien[2].name = "Ngoc Trinh3";
        arrNhanvien[2].cnt++;

        for (int i = 0; i < arrNhanvien.length; i++) {
            Nhanvien nhanvien = arrNhanvien[i];
            System.out.println(nhanvien.name + " " + nhanvien.cnt);
        }
    }
}
