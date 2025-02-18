package com.devmaster.lesson01.pkg_default_method;

public class MultiInheristance implements Shape, Interface1, Interface2 {
    @Override
    public void draw() {
        System.out.println("MultiInheristance đang vẽ...");
    }

    public void method1() {
        Interface1.super.method1();
        System.out.println("MultiInheristance.method1");
    }

    @Override
    public void method2() {
        Interface2.super.method2();
        System.out.println("MultiInheristance.method2");
    }

    public static void main(String[] args) {
        MultiInheristance mi = new MultiInheristance();
        mi.method1();
        mi.method2();
        mi.draw();
    }
}
