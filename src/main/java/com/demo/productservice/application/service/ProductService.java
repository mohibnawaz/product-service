package com.demo.productservice.application.service;

import com.demo.productservice.domain.entity.Product;
import java.util.List;

public interface ProductService {
    Product create(Product p);
    List<Product> getAll();
}