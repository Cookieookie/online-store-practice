package com.javamaster.Controller;

import com.javamaster.Entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ProductController {

    @GetMapping("/products")
    public List<Product> getAllProducts() {

    }
}
