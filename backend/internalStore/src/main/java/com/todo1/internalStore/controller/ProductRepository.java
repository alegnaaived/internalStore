package com.todo1.internalStore.controller;

import org.springframework.data.repository.CrudRepository;

import com.todo1.internalStore.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
