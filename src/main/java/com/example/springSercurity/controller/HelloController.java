package com.example.springSercurity.controller;

import com.example.springSercurity.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/index")
    public ResponseEntity<String> index() {
        ResponseEntity responseEntity = new ResponseEntity(new Product(1, "HP", 2000), HttpStatus.OK);
        return responseEntity;
    }
}
