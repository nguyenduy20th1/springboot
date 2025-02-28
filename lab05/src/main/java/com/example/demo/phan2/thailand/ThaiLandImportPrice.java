package com.example.demo.phan2.thailand;

import com.example.demo.phan2.product.Product;

import java.util.Scanner;

public class ThaiLandImportPrice extends Product {
    private float taxImported;
    private float importPriceSupport;

    public ThaiLandImportPrice() {

    }

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public float getImportPriceSupper() {
        return importPriceSupport;
    }

    public void setImportPriceSupport(float importPriceSupper) {
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLandImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported, float importPriceSupport) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    public ThaiLandImportPrice(float taxImported, float importPriceSupport) {
        this.taxImported = taxImported;
        this.importPriceSupport = importPriceSupport;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Thuế nhâp khẩu: ");
        this.taxImported = sc.nextFloat();
        System.out.println("Giá hỗ trợ nhập khẩu: ");
        this.importPriceSupport = sc.nextFloat();
    }

    @Override
    public float calculateSalePrice() {
        float imported_price = super.getProducerPrice();
        float salePrice = imported_price + taxImported*imported_price - importPriceSupport*imported_price + 0.1f * (imported_price + taxImported*imported_price - importPriceSupport*imported_price);
        return salePrice;
    }

    @Override
    public void display() {
        System.out.println("Hỗ trợ: " + importPriceSupport);
        System.out.println("Thuế nhập khẩu: " + (int) (taxImported*100) + "%");
        System.out.println("Giá bán tại Thái lan: " + calculateSalePrice());
    }
}
