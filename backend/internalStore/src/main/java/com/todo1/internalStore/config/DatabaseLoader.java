package com.todo1.internalStore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.todo1.internalStore.controller.ProductRepository;
import com.todo1.internalStore.entity.Product;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Autowired
    public DatabaseLoader(ProductRepository repository){
        this.productRepository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Product temp = new Product(225345234, "Mug", "kitchen", "Batman", "DC");
        System.out.println(temp.toString());
        this.productRepository.save(temp);
        
    }

    
}
