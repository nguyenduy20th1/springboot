package com.devmaster.lesson5thuchanh.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String email;

    // Getters & Setters
}
