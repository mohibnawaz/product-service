package com.demo.productservice.application.service.impl;

import com.demo.productservice.application.service.ProductService;
import com.demo.productservice.domain.entity.Product;
import com.demo.productservice.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repo;

    public ProductServiceImpl(ProductRepository repo) {
        this.repo = repo;
    }

    public Product create(Product p) { return repo.save(p); }
    public List<Product> getAll() { return repo.findAll(); }
}