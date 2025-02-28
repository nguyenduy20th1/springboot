package com.example.demo.phan2.product;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public Product() {

    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product ID: ");
        this.prodId = sc.nextLine();
        System.out.println("Product Name: ");
        this.prodName = sc.nextLine();
        System.out.println("Manufacturer: ");
        this.manufacturer = sc.nextLine();
        System.out.println("Producer Price: ");
        this.producerPrice = sc.nextFloat();
    }

    public float calculateSalePrice() {
        float sale_Price = getProducerPrice() + 0.05f * getProducerPrice();
        return sale_Price;
    }
    public void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Product Name: " + prodName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Producer Price: " + producerPrice);
        System.out.println("Sale_Price: " + calculateSalePrice());
    }
}