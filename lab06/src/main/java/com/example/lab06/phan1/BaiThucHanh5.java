package com.example.lab06.phan1;

/**
 * @author Devmaster
 */
public class BaiThucHanh5 {
    void yeuCau1() {
        String vietnam = "Việt Nam";
        System.out.println("concat() = " + vietnam.concat(" Cộng hòa XHCN"));
    }

    void yeuCau2() {
        String baoViet= "Tổng Cty Bảo hiểm Bảo Việt(Bảo hiểm Bảo Việt - BaoViet"
                + "Insurance) là Cty thành viên được tập đoàn Tài chính - Bảo hiểm "
                + "Bảo Việt đầu tư 100 vốn";
        System.out.println("length() = " + baoViet.length());
        baoViet = baoViet.replaceAll("Cty", "Công ty");
        System.out.println("repleceAll() = " + baoViet);
    }

    void yeuCau3() {
        String baoViet= "Tổng Cty Bảo hiểm Bảo Việt(Bảo hiểm Bảo Việt - BaoViet"
                + "Insurance) là Cty thành viên được tập đoàn Tài chính - Bảo hiểm "
                + "Bảo Việt đầu tư 100 vốn";
        System.out.println("toUpperCase()= " + baoViet.toUpperCase());
        System.out.println("toLowerCase()= " + baoViet.toLowerCase());
    }

    void yeuCau4() {
        String baoViet= "Tổng Cty Bảo hiểm Bảo Việt(Bảo hiểm Bảo Việt - BaoViet"
                + "Insurance) là Cty thành viên được tập đoàn Tài chính - Bảo hiểm "
                + "Bảo Việt đầu tư 100 vốn";
        System.out.println("lastIndexOf() = " + baoViet.indexOf("Bảo Việt"));
    }

    void yeuCau5() {
        String baoViet= "Tổng Cty Bảo hiểm Bảo Việt(Bảo hiểm Bảo Việt - BaoViet"
                + "Insurance) là Cty thành viên được tập đoàn Tài chính - Bảo hiểm "
                + "Bảo Việt đầu tư 100 vốn";
        String[] arrBaoViet = baoViet.split(" ");
        for (int i = 0; i < baoViet.length(); i++) {
            String arrBaoViet1 = arrBaoViet[i];
            if (i % 2 == 0) {
                System.out.println("/t" + arrBaoViet1);
            }
            else {
                System.out.println(arrBaoViet1);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaiThucHanh5 obj = new BaiThucHanh5();
        obj.yeuCau1();
        obj.yeuCau2();
    }
}
