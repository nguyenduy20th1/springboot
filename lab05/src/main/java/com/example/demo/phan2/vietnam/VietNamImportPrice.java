package com.example.demo.phan2.vietnam;

import com.example.demo.phan2.product.Product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported;
    private static Scanner scanner = new Scanner(System.in); // Sử dụng chung Scanner

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }

    public VietNamImportPrice() {
    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    @Override
    public void input() {
        super.input();  // Gọi input() từ Product để nhập thông tin sản phẩm
        System.out.print("Thuế nhập khẩu (%): ");
        this.taxImported = scanner.nextFloat() / 100;  // Chuyển đổi thành số thập phân
    }

    @Override
    public float calculateSalePrice() {  // Đã sửa lỗi chính tả
        float imported_price = super.getProducerPrice();
        float salePrice = imported_price + taxImported * imported_price + 0.1f * (imported_price + taxImported * imported_price);
        return salePrice;
    }

    @Override
    public void display() {
        super.display();  // Hiển thị thông tin sản phẩm từ Product
        System.out.println("Thuế nhập khẩu: " + (int) (taxImported * 100) + "%");
        System.out.println("Giá bán tại Việt Nam: " + calculateSalePrice());
    }
}
