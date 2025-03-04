package com.devmaster.lesson04.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity  // Đánh dấu đây là entity để Spring Boot quản lý
@Table(name = "users") // Tên bảng trong database
@Data  // Gồm Getter, Setter, toString, equals, hashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id  // Đánh dấu ID là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng
    Long id;

    @Column(unique = true, nullable = false) // Không cho phép null, giá trị phải là duy nhất
    String username;

    @Column(nullable = false)
    String password;

    @Column(nullable = false)
    String fullName;

    @Column(nullable = false)
    LocalDate birthDay;

    @Column(unique = true, nullable = false)
    String email;

    @Column(nullable = false)
    String phone;

    @Column(nullable = false)
    int age;

    @Column(nullable = false)
    Boolean status;
}
