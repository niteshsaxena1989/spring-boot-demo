package com.nitesh.springboot.demo.service;

import com.nitesh.springboot.demo.entity.Product;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

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
}
