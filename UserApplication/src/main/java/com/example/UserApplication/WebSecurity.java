package com.example.UserApplication;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import Models.User;
import Services.UserService;
@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	private DataSource  datasource ;
	@Autowired
	public void Authentication(AuthenticationManagerBuilder authBuilder) throws Exception
	{
		authBuilder.jdbcAuthentication()
		.dataSource(datasource)
		.passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("select username, password, enabled from users where username=?") 
		.authoritiesByUsernameQuery("select username, role from users where username=?"); 
	}  
	
  @Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.permitAll()
		.and()
		.logout()
		.permitAll() ; 
		
	} 
	 

}