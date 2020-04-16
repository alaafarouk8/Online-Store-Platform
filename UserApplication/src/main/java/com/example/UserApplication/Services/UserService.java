package com.example.UserApplication.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserApplication.DA.UserInterface;
import com.example.UserApplication.Models.User;

@Service
public class UserService {
	@Autowired
	private UserInterface log;
	
	public List<User> listAll(){
		return log.findAll();
	}

	public void save(User user)
	{
		log.save(user);
	}
	
	public void adduser (User user)
	{
		log.save(user) ; 
	}
	

}
