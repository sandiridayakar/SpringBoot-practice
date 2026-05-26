package com.example.demo.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.demo.model.products;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class productService {

    private final List<products> obj = new ArrayList<>(Arrays.asList(
        new products(101,"ipone",10000),
        new products(102,"iwatch",90000)
    ));

    public List<products> getProducts() {
        return obj;
    }

    public com.example.demo.model.products getProductsbyId(int prodId) {
        return obj.stream()
                .filter(p -> p.getId() == prodId)
                .findFirst().orElse(new products(500, "empty", 000));
    }

    public void saveProduct(products prod) {
        obj.add(prod);
    }

    @PutMapping("/product/{prodId}")
    public void updateProduct(@PathVariable int prodId, @RequestBody products prod) {

        for (int i = 0; i < obj.size(); i++) {
            if (obj.get(i).getId() == prodId) {
                obj.set(i, prod);
                return;
            }
        }
        // obj.set(prodId, prod)

    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        int index = 0;
        for(int i=0;i<obj.size();i++){
            if(obj.get(i).getId()== prodId){
                index = i;
                break;
            }
        }
        obj.remove(index);
    }


}
