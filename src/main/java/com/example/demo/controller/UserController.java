package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repoi.UserRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<User> getUsers() {
//		List<User> usersList = new ArrayList<User>();
//		User user = new User();
//		user.setId((long) 1);
//		user.setName("saik");
//		user.setEmail("sai@gmail.com");
//		usersList.add(user);

		return userRepository.findAll();
	}

	@PostMapping
	public User createUser(@RequestBody User user) {
		user.setId((long) 1);
		user.setName("saikumar");
		user.setEmail("sai@gmail.com");
		return userRepository.save(user);
	}

}
