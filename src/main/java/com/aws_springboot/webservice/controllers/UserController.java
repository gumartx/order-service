package com.aws_springboot.webservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws_springboot.webservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1, "Bob Brown", "bob@gmail.com", "(15) 99200-4567", "1234567");
		return ResponseEntity.ok(user);
	}
	
}
