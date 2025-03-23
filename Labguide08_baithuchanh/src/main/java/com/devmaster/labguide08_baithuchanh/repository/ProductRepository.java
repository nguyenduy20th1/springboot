package com.devmaster.labguide08_baithuchanh.repository;

import com.devmaster.labguide08_baithuchanh.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
