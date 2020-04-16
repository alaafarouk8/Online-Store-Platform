package com.example.UserApplication;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassString = "example";
		String encodedPassString = encoder.encode(rawPassString);
		System.out.println(encodedPassString);

	}

}
