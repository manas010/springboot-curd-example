package com.manas.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manas.curd.entity.Users;
import com.manas.curd.service.UsersService;

@RestController
@RequestMapping("/myuser")
public class UserController {
	
	@Autowired
	UsersService service;
	
	@PostMapping("/adduser")
    public Users addProduct(@RequestBody Users user) {
        return service.addUser(user);
    }

    @PostMapping("/addUsers")
    public List<Users> addUsers(@RequestBody List<Users> users) {
        return service.addUsers(users);
    }

    @GetMapping("/getUsers")
    public List<Users> getAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/getUsersById/{id}")
    public Users getUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    @GetMapping("/getUsersByName/{name}")
    public Users findUsersByName(@PathVariable String name) {
        return service.getUserByName(name);
    }

	@PutMapping("/update")
	public Users updateProduct(@RequestBody Users users) {
		return service.updateUser(users);
	}

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteUserById(id);
    }

}
