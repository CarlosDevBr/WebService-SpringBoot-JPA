package com.example.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservice.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
