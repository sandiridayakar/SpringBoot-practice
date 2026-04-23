package com.example.demo;



public class products {

    private int prodId;
    private String name;
    private int price;
    
    public products(int prodId, String name, int price) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return prodId;
    }
    public void setId(int prodId) {
        this.prodId = prodId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
