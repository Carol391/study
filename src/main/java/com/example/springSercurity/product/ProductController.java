package com.example.springSercurity.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    public ProductService getProductService() {
        System.out.println("get Product controller");
        return productService;
    }

    public void setProductService(ProductService productService) {
        System.out.println("set Product controller");
        this.productService = productService;
    }
    @Autowired
    public ProductController(@Qualifier(value = "productServiceImp2")ProductService productService) {
        this.productService = productService;
        System.out.println("ProductController has arg");
    }

    public ProductController() {
        System.out.println("ProductController no arg");
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
}
