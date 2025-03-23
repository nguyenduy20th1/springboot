package com.devmaster.labguide08_baithuchanh.entity;

import jakarta.persistence.*;

@Entity
public class Product_Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "configId")
    private Configuration configuration;
    private String value;
}
