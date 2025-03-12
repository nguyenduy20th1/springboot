package com.devmaster.labguide.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
    private int age;
}
