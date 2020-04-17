package com.example.UserApplication.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.UserApplication.Models.User;
import com.example.UserApplication.Services.UserService;




@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/listofusers")
	public String viewlistusers(Model model ,User user) {
		
		List <User> listUsers = service.listAll();
		model.addAttribute("listUsers", listUsers);

			return "index";	 
		
	}
	@RequestMapping("/")
	public String welcome(Model model) {
		return "success";
	}
	@RequestMapping("/new")
	public String adduser(Model model) {
	    User user = new User();
	    model.addAttribute("user",user);
	     
	    return "NewUser";
	}
	
	@RequestMapping(value="/save")
	public String saveuser(@ModelAttribute("user") User user) {
	      service.adduser(user);
	      return "redirect:/listofusers";   
	}

	@RequestMapping("/login")
	public String login(Model model) {
	    return "login";
	}
	
	
}