package com.Vcube.Online.Shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vcube.Online.Shopping.model.Product;
import com.Vcube.Online.Shopping.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService proser;

	@PostMapping
	public  Product createCustomer(@RequestBody Product p)
	 {
		 return proser.createCustomer(p);
	 }

}
