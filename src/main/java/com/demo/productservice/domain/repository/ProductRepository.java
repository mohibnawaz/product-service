package com.demo.productservice.domain.repository;

import com.demo.productservice.domain.entity.Product;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Product save(Product product);
    Optional<Product> findById(Long id);
    List<Product> findAll();
}