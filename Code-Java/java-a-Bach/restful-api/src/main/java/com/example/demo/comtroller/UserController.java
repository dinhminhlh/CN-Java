package com.example.demo.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modeldto.UserDto;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {""}, method = RequestMethod.GET)
	public ResponseEntity<?> getListUser() {
		List<UserDto> users = userService.getListUser();
		return ResponseEntity.status(200).body(users);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id){
		UserDto result = userService.getUserById(id);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/search")
	public ResponseEntity<?> searchUser(@RequestParam(value = "keyword", required = false, defaultValue = "") String name){
		List<UserDto> users = userService.searchUser(name);
		return ResponseEntity.status(200).body(users);
		
	}
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Heello";
	}
	
	@PostMapping("")
	public ResponseEntity<?> createUser() {
		return null;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser() {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser() {
		return null;
	}

}
