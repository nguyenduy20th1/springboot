package com.devmaster.labGuide04.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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
public class KhoaDTO {
    @Size(min = 2, message = "Mã khoa phải có ít nhất 2 ký tự")
    @NotNull(message = "bạn để trống kìa")
    String makh;
    @Size(min = 5, max = 25, message = "từ 5 -> 25 kí tự")
    String tenkh;
}
