package com.manas.curd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manas.curd.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	Optional<Users> findByName(String name);

}
