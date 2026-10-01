package com.demo.productservice.infrastructure.repository;

import com.demo.productservice.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Product, Long> {
}