package com.javamaster.controller;

import com.javamaster.Entity.ProductEntity;
import com.javamaster.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getAllProducts() {
        log.info("Handles get all products request");
        return productService.findAll();
    }
    
    @GetMapping("/product/{id}")
    public ProductEntity findById(@PathVariable Integer id) {
        log.info("Handles getting products by id");
        return productService.findById(id);
    }
}
