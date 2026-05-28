package com.example.demo.service;
// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import com.example.demo.model.products;
import com.example.demo.repo.productRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class productService {

    // private final List<products> obj = new ArrayList<>(Arrays.asList(
    //     new products(101,"ipone",10000),
    //     new products(102,"iwatch",90000)
    // ));
    @Autowired
    productRepo repo;

    public List<products> getProducts() {
        return repo.findAll();
    }

    public com.example.demo.model.products getProductsbyId(int prodId) {
        return repo.getReferenceById(prodId);
    }

    public void saveProduct(products prod) {
        repo.save(prod);
    }

    public void updateProduct(@RequestBody products prod) {
        repo.save(prod);
    }

    public void deleteProduct(@PathVariable int prodId){
        repo.deleteById(prodId);
    }


}
