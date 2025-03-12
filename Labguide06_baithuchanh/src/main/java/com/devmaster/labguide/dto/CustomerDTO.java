package com.devmaster.labguide.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter

public class CustomerDTO {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String address;
    private String phone;
    private String email;
    private LocalDate birthDay;
    private boolean active;
}
