package com.example.springSercurity.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("productServiceImp2")
public class ProductServiceImp2 implements ProductService {
    public ProductServiceImp2() {
        System.out.println("ProductServiceImp2");
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>();
    }
}
