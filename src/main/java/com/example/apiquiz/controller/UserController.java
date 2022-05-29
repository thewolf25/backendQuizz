package com.example.apiquiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiquiz.models.UserQuiz;
import com.example.apiquiz.repository.UserRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Quiz App")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	@ApiOperation(value = "list of users")
	public List<UserQuiz> listUser() {
		return userRepository.findAll();
	}

	@GetMapping("/user/{id}")
	@ApiOperation(value = "uer by ID")
	public UserQuiz userById(@PathVariable(value = "id") long id) {
		return userRepository.findById(id);
	}

	@PostMapping("/create/user")
	@ApiOperation(value = "create user")
	public UserQuiz createUser(@RequestBody UserQuiz userQuiz) {
		return userRepository.save(userQuiz);
	}

	@DeleteMapping("/delete/user")
	@ApiOperation(value = "delete user")
	public void deleteUser(@RequestBody UserQuiz userQuiz) {
		userRepository.delete(userQuiz);
	}

	@PutMapping("/update/user")
	@ApiOperation(value = "update user")
	public UserQuiz updateUser(@RequestBody UserQuiz userQuiz) {
		return userRepository.save(userQuiz);
	}

}
