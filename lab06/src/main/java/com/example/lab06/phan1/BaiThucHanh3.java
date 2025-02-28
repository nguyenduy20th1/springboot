package com.example.lab06.phan1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Devmaster
 */
public class BaiThucHanh3 {
    ArrayList<String> IstMonHoc = new ArrayList<>();
    public void test() {
        IstMonHoc.add("Java");
        IstMonHoc.add("SQL");
        IstMonHoc.add("C#");
        IstMonHoc.add("Android");

        System.out.println("Danh sách chưa sắp xếp");
        for (int i = 0; i < IstMonHoc.size(); i++) {
            String get = IstMonHoc.get(i);
            System.out.println((i+1) + " " + get);
        }

        Collections.sort(IstMonHoc);

            System.out.println("Danh sách sau khi sắp xếp");
            for (int i = 0; i < IstMonHoc.size(); i++) {
                String get = IstMonHoc.get(i);
                System.out.println((i+1) + " " + get);
            }
    }
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaiThucHanh3 obj = new BaiThucHanh3();
        obj.test();
    }
}
