package com.example.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservice.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
