package com.nitesh.springboot.demo.controller;

import com.nitesh.springboot.demo.entity.Product;
import com.nitesh.springboot.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public Collection<Product> getProducts() {
        return productService.getAllProducts();
    }
}
