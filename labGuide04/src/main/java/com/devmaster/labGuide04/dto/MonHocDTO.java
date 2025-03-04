package com.devmaster.labGuide04.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MonHocDTO {
    @Size(min = 2, max = 2, message = "chi gồm 2 ki tự")
    String mamh;
    @Size(min = 5, max = 50, message = "từ 5 -> 50 kí tự")
    String tenmh;
    @Min(value = 45, message = "từ 45 tiết")
    @Max(value = 60, message = "đến 60 tuổi")
    int sotiet;
}
