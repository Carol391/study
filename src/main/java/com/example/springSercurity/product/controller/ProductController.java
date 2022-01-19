package com.example.springSercurity.product.controller;

import com.example.springSercurity.product.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    public List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "HP", 2000),
            new Product(2, "Dell", 3000),
            new Product(3, "Macbook", 5000),
            new Product(4, "Asus", 3000)));

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
