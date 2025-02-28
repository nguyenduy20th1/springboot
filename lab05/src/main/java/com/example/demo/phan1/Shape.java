package com.example.demo.phan1;

public class Shape {
    public static final int SHAPE_RECTANGLE = 1;
    public static final int SHAPE_CIRCLE = 2;
    public static final int SHAPE_TRIANGLE = 3;

    public int shapeCode = 0;

    public void tinhDienTich(float width, float height) {
        System.out.println("Diện tích hình chữ nhật: " + (width * height));
    }

    public void tinhDienTich(float radius) {
        System.out.println("Diện tích hình tròn: " + (Math.PI * radius * radius));
    }

    public void tinhDienTich(float width, double bottom) {
        System.out.println("Diện tích hình tam giác: " + (0.5 * width * bottom));
    }

    public void tinhChuVi(float width, float height) {
        System.out.println("Chu vi hình chữ nhật: " + (2 * (width + height)));
    }

    public void tinhChuVi(float radius) {
        System.out.println("Chu vi hình tròn: " + (2 * Math.PI * radius));
    }

    public void tinhChuVi(float edge1, float edge2, float edge3) {
        System.out.println("Chu vi hình tam giác: " + (edge1 + edge2 + edge3));
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.tinhDienTich(5, 10);
        shape.tinhDienTich(7);
        shape.tinhDienTich(6, 8);

        shape.tinhChuVi(5, 10);
        shape.tinhChuVi(7);
        shape.tinhChuVi(3, 4, 5);
    }
}
