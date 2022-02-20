package com.example.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservice.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
