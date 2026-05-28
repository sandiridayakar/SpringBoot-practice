package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.products;
import com.example.demo.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class productcontroller {

    @Autowired
    productService service;

    @GetMapping("/product")
    public List<products> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/product/{prodId}")
    public products geProductsbyId(@PathVariable int prodId){
        return service.getProductsbyId(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody products prod){
        service.saveProduct(prod);
    }

    @PutMapping("/product/{prodId}")
    public void updateProduct( @RequestBody products prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(int prodId){
        service.deleteProduct(prodId);
    }

}
