package com.nitesh.springboot.demo.service;

import com.nitesh.springboot.demo.entity.Product;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.io.ObjectInputStream;
import java.util.*;

@Service
public class ProductService implements InitializingBean {

    List<Product> products = new ArrayList<Product>();

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BootStraping products . . .");
        for (int i = 0; i < 5; i++) {
            products.add(new Product(i+1, "Product "+ (i+1), "6464248111||||56546-"+ (i+1),
                    456.35D, new Date(), "Company "+ (i+1)));
        }
        System.out.println("BootStraping products . . . Finished");
    }

    public Collection<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Boolean updateProduct(Product product, int id) {
        Boolean status = Boolean.FALSE;
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getId() == id) {
                products.set(i, product);
                status = Boolean.TRUE;
            }
        }
        return status;
    }

    public Boolean deleteProduct(int id) {
        return products.removeIf(p -> p.getId() == id);
    }
}
