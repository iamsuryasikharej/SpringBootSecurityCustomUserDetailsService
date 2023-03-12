package com.surya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.surya.userdetailsconfig.CustomUserDetailsService;
@Configuration
public class SecurityConfig {
	@Autowired
	@Qualifier("encoder")
	@Lazy
	PasswordEncoder e;
	@Bean
	public UserDetailsService getUserDetailsService()
	{
//		User.withUsername("surya").password("{bcrypt}$2a$10$pZXMvFenJ33jWLRvGieiGOyS9YFmFqIlI6lAPSCR8uosW0ZMTRKlq").authorities("ADMIN").build();
//		return new InMemoryUserDetailsManager(User.withUsername("surya").password(e.encode("surya")).authorities("ADMIN").build());
		return new CustomUserDetailsService();
		
	}
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	

}
