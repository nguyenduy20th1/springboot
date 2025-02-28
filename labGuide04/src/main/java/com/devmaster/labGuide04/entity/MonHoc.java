package com.devmaster.labGuide04.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "monhoc")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MonHoc {
    @Id
    String mamk;
    String tenmk;
    int sotiet;

}
