package com.javamaster.Service;

import com.javamaster.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Integer id);
}
