package com.devmaster.labguide05.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Builder

public class User {
    private Long id;
    private String name;
    private String address;
}
