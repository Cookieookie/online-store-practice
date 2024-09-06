package com.javamaster.service;

import com.javamaster.Entity.ProductEntity;
import com.javamaster.Exception.NotFoundException;
import com.javamaster.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    @Override
    @SneakyThrows
    public ProductEntity findById(Integer id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Sorry! Product not Found."));
    }

}
