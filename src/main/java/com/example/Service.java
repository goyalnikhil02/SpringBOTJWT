package com.example;

import org.springframework.stereotype.Component;

@Component
public class Service {
	
	public String sayHello(String email,String username)
	{
		return "Hello"+ username+":Your email id:"+email +""+ "is created";
		
	}
}
