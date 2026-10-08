package com.Vcube.Online.Shopping.service;

import java.util.List;

import com.Vcube.Online.Shopping.model.Product;

public interface ProductService {

    Product createCustomer(Product p);

    List<Product> getAllCustomers();

    Product getCustomer(Integer cid);

    Product getUpdateCustomer(Product p);

    void getDeleteCustomer(Integer cid);
}
