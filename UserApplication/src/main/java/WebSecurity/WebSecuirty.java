package WebSecurity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
public class WebSecuirty extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource  datasource ;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		super.configure(http);
	} 
	@Autowired
	public void Authentication(AuthenticationManagerBuilder authBuilder) throws Exception
	{
		authBuilder.jdbcAuthentication()
		.dataSource(datasource)
		.passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("select email , password , enabled from user where email=?") 
		.authoritiesByUsernameQuery("select email from user where email=?"); 
	}

}
