package com.Vcube.Online.Shopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="customer")

@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer cid;
	
    String state;
	String name;
	Integer age;
	Long phone;
	String city;
	String email;
	
	
	
	
  

	
	
}
