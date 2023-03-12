package com.surya.controllers;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class DemoController {
	@GetMapping("/hello")
public String hello()
{
	
	BCryptPasswordEncoder b=new BCryptPasswordEncoder();
	b.encode("surya");
	System.out.println(b.encode("surya"));
	return "hello";
}
}
