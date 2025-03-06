package com.devmaster.labguide05.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class UserDTO {
    String name;
    int age;
    String email;
    String address;
}
