package com.devmaster.labguide05.phan1;

public class MainClass {
    final float PI = 3.14f;

    /**
     * Display the value of PI
     *
     * @param pi a float variable storing the value of PI
     *
     * @return void
     */
    public void display(float pi) {
//        PI = pi;
//        final đã ngăn chặn PI gán biến nên đã báo lỗi ở dòng này
        System.out.println("PI = " + PI);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final MainClass obj = new MainClass();
        obj.display(22.7f);
    }
}
