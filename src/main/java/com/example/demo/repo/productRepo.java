package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.model.products;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface productRepo extends JpaRepository<products, Integer> {

}
