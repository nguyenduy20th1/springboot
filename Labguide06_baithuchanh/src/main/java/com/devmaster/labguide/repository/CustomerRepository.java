package com.devmaster.labguide.repository;

import com.devmaster.labguide.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
