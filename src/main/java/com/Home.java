package com;

@RestController
public class Home {

    @RequestingMapping("/")
    public void show(){
        System.out.println("wel come");
    }

}
