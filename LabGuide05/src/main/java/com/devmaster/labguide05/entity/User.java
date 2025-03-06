package com.devmaster.labguide05.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder

public class User {
    String name;
    int age;
    String email;
    String address;
}
