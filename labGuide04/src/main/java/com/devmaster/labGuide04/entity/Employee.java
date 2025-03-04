package com.devmaster.labGuide04.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

    int id;
    String fullName;
    String gender;
    int age;
    float salary;
}
