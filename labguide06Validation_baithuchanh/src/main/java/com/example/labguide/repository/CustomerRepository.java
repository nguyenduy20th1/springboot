package com.example.labguide.repository;

import com.example.labguide.entity.Customer;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    boolean existsByUsername(@NotBlank(message = "Không được để trống") String username);
}
