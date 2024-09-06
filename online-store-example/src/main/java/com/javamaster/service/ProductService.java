package com.javamaster.service;

import com.javamaster.Entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAll();

    ProductEntity findById(Integer id);
}
