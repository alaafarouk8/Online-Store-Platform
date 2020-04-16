package com.example.UserApplication.DA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserApplication.Models.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	 User findByUsername(String username);
}
