package com.devmaster.labguide.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder
@Table(name = "books")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String imageURL;
    String Qty;
    String Price;
    String yearRelease;
    String author;
    Boolean status;
    @ManyToOne
    @JoinColumn(name = "categoryID", nullable = false)
    Category category;
}
