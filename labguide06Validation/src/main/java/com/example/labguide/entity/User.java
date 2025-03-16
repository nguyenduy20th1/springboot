package com.example.labguide.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Họ và tên không được để trống!")
    @Size(min = 3, message = "Tối thiểu 3 kí tự")
    private String fullName;
    @NotBlank(message = "Tài khoản không để trống")
    @Size(min = 3, message = "Tài khoản tối thiểu 3 kí tự")
    private String username;
    @NotBlank(message = "Mật khẩu không được để trống")
    @Size(min = 6, message = "Mật phải phải từ 6 ký tự")
    private String password;
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Không đúng định dạng")
    private String email;
//    @Pattern(regexp = "^\\+?[0-9] {10,15}$", message = "Số điện thoại 10 ký tự")
    private String phone;
    private String address;
    private Boolean isActive;
}
