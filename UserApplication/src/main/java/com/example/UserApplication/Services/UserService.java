package com.example.UserApplication.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< Updated upstream:UserApplication/src/main/java/Services/UserService.java

<<<<<<< Updated upstream:UserApplication/src/main/java/com/example/UserApplication/Services/UserService.java
import com.example.UserApplication.DA.UserRepository;
import com.example.UserApplication.Models.User;
=======
import DA.UserInterface;
import Models.User;
=======
import com.example.UserApplication.DA.UserRepository;
import com.example.UserApplication.Models.User;
>>>>>>> Stashed changes:UserApplication/src/main/java/com/example/UserApplication/Services/UserService.java
>>>>>>> Stashed changes:UserApplication/src/main/java/Services/UserService.java

@Service
public class UserService {
	@Autowired
	private UserRepository log;
	
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

	public Object findByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
