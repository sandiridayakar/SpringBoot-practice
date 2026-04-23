package com.example.demo.controller;

import java.util.List;

import com.example.demo.products;
import com.example.demo.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class productcontroller {

    @Autowired
    productService service;

    @GetMapping("/product")
    public List<products> getProducts(){
        return service.getProducts();
    }


    @RequestMapping("/product/{prodId}")
    
    public products geProductsbyId(int prodId){
        return service.getProductsbyId(prodId);
    }

}
