package com.nitesh.springboot.demo.controller;

import com.nitesh.springboot.demo.entity.Product;
import com.nitesh.springboot.demo.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public Collection<Product> getProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable int id) {
        return productService.getProduct(id);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public Boolean updateProduct(@RequestBody Product product, @PathVariable int id) {
        return productService.updateProduct(product, id);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public Boolean deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
