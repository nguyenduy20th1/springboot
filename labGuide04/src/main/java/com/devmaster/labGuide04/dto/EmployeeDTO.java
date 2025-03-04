package com.devmaster.labGuide04.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDTO {

    int id;
    @Size(min = 3, max = 25)
    String fullName;
    @Size(min = 3, max = 25)
    String gender;
    @Min(value = 18, message = "từ 18 tuổi")
    @Max(value = 60, message = "dưới 60 tuổi")
    int age;
    @Positive(message = "phải lớn hơn 0")
    float salary;

}
