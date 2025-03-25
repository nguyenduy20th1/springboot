package com.devmaster.labguide08_baithuchanh.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imgUrl;
    private String quantity;
    private String price;
    private Boolean isActive;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Product_Config> product_configs;
}
