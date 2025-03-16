package com.example.labguide.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Không được để trống")
    private String username;
    @NotBlank(message = "Không được để trống")
    @Size(min = 6, message = "Tối thiểu 6 kí tự")
    private String password;
    @NotBlank(message = "Không được để trống")
    private String fullName;
    @NotBlank(message = "Không được để trống")
    private String address;
//    @Pattern(regexp = "^+?[0-9] {10,15}$", message = "Từ 10 - 15 số")
    private String phone;
    private String email;
    private LocalDate birthday;
    private Boolean isActive;
}
