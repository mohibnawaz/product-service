package com.demo.productservice.presentation.controller;

import com.demo.productservice.application.service.ProductService;
import com.demo.productservice.domain.entity.Product;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    public Product create(@RequestBody Product p) { return service.create(p); }

    @GetMapping
    public List<Product> getAll() { return service.getAll(); }
}