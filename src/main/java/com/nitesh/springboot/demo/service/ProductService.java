package com.nitesh.springboot.demo.service;

import com.nitesh.springboot.demo.entity.Product;
import com.nitesh.springboot.demo.repository.ProductRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
public class ProductService implements InitializingBean {

    @Autowired
    private ProductRepository productRepository;

    public Collection<Product> getAllProducts() {
        List<Product> products = new ArrayList<Product>();
        Iterable<Product> productIterable = productRepository.findAll();
        productIterable.forEach(p -> products.add(p));
        return products;
    }

    public Product getProduct(Long id) {
        /*return products.stream().filter(p -> p.getId() == id).findFirst().get();*/
        return productRepository.findOne(id);
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product, Long id) {
        product.setId(id);
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        /*return products.removeIf(p -> p.getId() == id);*/
        productRepository.delete(id);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Product product = new Product("Product-" + i, "6546512|||||6542-" + i,
                    542.265d + i, new Date(), "Company - " + i);
            products.add(product);
        }
        productRepository.save(products);
    }

    public Product getProductByName(String name) {
        return productRepository.getProductByName(name);
    }
}
