package com.javamaster.Controller;

import com.javamaster.Entity.Product;
import com.javamaster.Service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        log.info("Handles get all products request");
        return productService.findAll();
    }
    
    @GetMapping("/product/{id}")
    public Product findById(@PathVariable Integer id) {
        log.info("Handles getting products by id");
        return productService.findById(id);
    }
}
