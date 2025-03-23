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
public class Configuration {
    @Id
    private Long id;
    private String name;
    private Boolean isActive;

    @OneToMany(mappedBy = "configs", cascade = CascadeType.ALL)
    private List<Product_Config> product_configs;
}
