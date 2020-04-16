package com.example.UserApplication;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BCryptPasswordEncoder encode = new BCryptPasswordEncoder() ; 
        String rawPassword = "alaa123456" ; 
        String encodedPassword = encode.encode(rawPassword) ;
        System.out.println("encodedPassword : " + encodedPassword) ; 
       
	}

}
