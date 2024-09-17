package com.example.springsecurity.springsecurity;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<MyUser, Integer>{
	
	MyUser  findByusername(String username);

}
