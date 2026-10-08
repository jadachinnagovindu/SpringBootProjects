package com.Vcube.Online.Shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vcube.Online.Shopping.model.Product;
import com.Vcube.Online.Shopping.repo.ProductRepositary;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepositary prsr;

	@Override
	public Product createCustomer(Product p) {
		return prsr.save(p);
	}

	@Override
	public List<Product> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getCustomer(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getUpdateCustomer(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getDeleteCustomer(Integer cid) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
