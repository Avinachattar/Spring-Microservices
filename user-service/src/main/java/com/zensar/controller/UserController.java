package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.CombinedResult;
import com.zensar.User;
import com.zensar.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/user")
	public User save(@RequestBody User user) {
		return service.save(user);

	}
	
	@GetMapping("/user")
	public List<User> getAllDept(){
		return service.getAllUser();
		
	}
	
	@GetMapping("/user/{id}")
	public CombinedResult getProductById(@PathVariable("id") int id) {
		return service.getUserById(id);
	}
	

}
