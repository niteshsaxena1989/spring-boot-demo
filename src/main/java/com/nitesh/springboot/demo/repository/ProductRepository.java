package com.nitesh.springboot.demo.repository;

import com.nitesh.springboot.demo.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends CrudRepository<Product, Long> {

    public Product getProductByName(String name);

    public Product findByName(String name);
}
