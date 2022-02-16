package com.example.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservice.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> FindAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "991235485", "12345");
		return ResponseEntity.ok().body(u);
	}
}
