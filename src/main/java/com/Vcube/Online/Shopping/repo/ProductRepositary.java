package com.Vcube.Online.Shopping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Vcube.Online.Shopping.model.Product;

@Repository
public interface ProductRepositary extends JpaRepository<Product, Integer>{

}
