package com.example.UserApplication.Controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< Updated upstream:UserApplication/src/main/java/com/example/Controllers/UserController.java

import com.example.UserApplication.Models.User;
import com.example.UserApplication.Services.UserService;




=======
import com.example.UserApplication.Models.User;
import com.example.UserApplication.Services.UserService;


>>>>>>> Stashed changes:UserApplication/src/main/java/com/example/UserApplication/Controllers/UserController.java
@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/")
	public String viewlistusers(Model model) {
		List <User> listUsers = service.listAll();
		model.addAttribute("listUsers", listUsers);
		return "index";
	}
	
	@RequestMapping("/new")
	public String adduser(Model model) {
	    User user = new User();
	    model.addAttribute("user",user);     
	    return "NewUser";
	}
	
	@RequestMapping("/save")
	public String saveuser(@ModelAttribute("user") User user) {
<<<<<<< Updated upstream:UserApplication/src/main/java/com/example/UserApplication/Controllers/UserController.java
	      service.adduser(user);
	     if (user.getId()==1) {
	      return "redirect:/";
	     }
	     else
	     {
	    	 return "error" ; 
	     }
	}

	@RequestMapping("/login")
	public String login(Model model) {
	    User user = new User();
	    model.addAttribute("user",user);
	     
	    return "login";
=======
	    service.adduser(user);
<<<<<<< Updated upstream:UserApplication/src/main/java/com/example/Controllers/UserController.java
	     
	    return "redirect:/";
=======
	    if(user.getId()==1) {
	    return "redirect:/";
	    }
	    else 
	    {
	    	return"error";
	    }
	}

	@RequestMapping("/login")
	public String login(Model model) {
	    User user = new User();
	    model.addAttribute("user",user);     
	    return "login";
>>>>>>> Stashed changes:UserApplication/src/main/java/com/example/UserApplication/Controllers/UserController.java
>>>>>>> Stashed changes:UserApplication/src/main/java/com/example/Controllers/UserController.java
	}
	
	
}