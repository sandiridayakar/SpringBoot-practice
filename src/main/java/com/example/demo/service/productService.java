package com.example.demo.service;
import java.util.Arrays;
import java.util.List;
import com.example.demo.products;

import org.springframework.stereotype.Service;

@Service
public class productService {

    private final List<products> obj = Arrays.asList(
        new products(101,"ipone",10000),
        new products(102,"iwatch",90000)
    );

    public List<products> getProducts() {
        return obj;
    }

    public com.example.demo.products getProductsbyId(int prodId) {
        return obj.stream()
                .filter(p -> p.getId() == prodId)
                .findFirst().orElse(new products(500, "empty", 000));
    }

}
