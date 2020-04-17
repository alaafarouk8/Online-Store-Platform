package com.example.UserApplication.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.example.UserApplication.Models.User;
import com.example.UserApplication.Services.UserService;

public class AdminController {
	private UserService service;
public List<User> getlistusers(Model model ) {
	
	
		List <User> listUsers = service.listAll();
		model.addAttribute("listUsers", listUsers);
			
		return listUsers ; 
	} 

}
