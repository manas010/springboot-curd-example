package com.manas.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.manas.curd.entity.Users;
import com.manas.curd.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository usersRepository;
	
	public Users addUser(Users user) {
		return usersRepository.save(user);
	}
	
	public List<Users> addUsers(List<Users> users) {
		return usersRepository.saveAll(users);
	}
	
	public List<Users> getUsers(){
		return usersRepository.findAll();
	}
	public Users getUserById(int id) {
		return usersRepository.findById(id).orElse(null);
	}
	public Users getUserByName(String name) {
		return usersRepository.findByName(name).orElse(null);
	}
	public String deleteUserById(int id) {
		usersRepository.deleteById(id);
		return "User havig id "+id+" has successfully deleted";
	}
	
	public Users updateUser(Users users) {
		Users existingUsers = usersRepository.findById(users.getId()).orElse(null);
		existingUsers.setName(users.getName());
		existingUsers.setAddress(users.getAddress());
		existingUsers.setUserType(users.getUserType());
		return usersRepository.save(existingUsers);

	}
	 
	
}
