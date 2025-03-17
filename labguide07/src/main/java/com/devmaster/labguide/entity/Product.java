package com.devmaster.labguide.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "products")
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String imageURL;
    Integer quantity;
    Double price;
    String content;
    Boolean status;
    @ManyToOne
    @JoinColumn(name = "categoryID", nullable = false)
    Category category;
}
