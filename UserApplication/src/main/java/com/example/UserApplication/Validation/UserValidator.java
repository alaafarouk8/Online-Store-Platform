/*package com.example.UserApplication.Validation;

import org.springframework.validation.Validator;

import com.example.UserApplication.Models.User;
import com.example.UserApplication.Services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
@Component
public class UserValidator implements Validator  {

	 @Autowired
	 private UserService userService;
	 @Override
	    public boolean supports(Class<?> aClass) {
	        return User.class.equals(aClass);
	    }

	    @Override
	    public void validate(Object o, Errors errors) {
	        User user = (User) o;

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user", "NotEmpty");
	        if (user.getName().length() < 6 || user.getName().length() > 32) {
	            errors.rejectValue("user", "Size.user.user");
	        }
	        if (userService.findByUsername(user.getName()) != null) {
	            errors.rejectValue("user", "Duplicate.user.name");
	        }

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
	        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
	            errors.rejectValue("password", "Size.user.password");
	        }
	    }

} 
*/
