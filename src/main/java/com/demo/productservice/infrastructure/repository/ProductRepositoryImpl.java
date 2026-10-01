package com.demo.productservice.infrastructure.repository;

import com.demo.productservice.domain.entity.Product;
import com.demo.productservice.domain.repository.ProductRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductJpaRepository jpaRepo;

    public ProductRepositoryImpl(ProductJpaRepository jpaRepo) {
        this.jpaRepo = jpaRepo;
    }

    public Product save(Product p) { return jpaRepo.save(p); }
    public Optional<Product> findById(Long id) { return jpaRepo.findById(id); }
    public List<Product> findAll() { return jpaRepo.findAll(); }
}