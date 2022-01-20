package com.example.springSercurity.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("productServiceImp")
public class ProductServiceImp implements ProductService {

    public ProductServiceImp() {
        System.out.println("ProductServiceImp");
    }

    public List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "HP", 2000),
            new Product(2, "Dell", 3000),
            new Product(3, "Macbook", 5000),
            new Product(4, "Asus", 3000)));

    @Override
    public List<Product> getAllProducts() {
        return products;
    }
}
