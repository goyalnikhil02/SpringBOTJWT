package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemo2Application {
	
	
	//http://websystique.com/spring-security/secure-spring-rest-api-using-oauth2/
	
	
	//https://www.youtube.com/watch?v=gHrAXzGYbyQ&t=246s
	//http://boot-demo2.cfapps.io/bootdemo/persons/list
	//http://stackoverflow.com/questions/23403875/how-to-see-all-tables-in-my-h2-database-at-localhost8082
	//http://stackoverflow.com/questions/17803718/view-content-of-embedded-h2-database-started-by-spring
	//http://theopentutorials.com/tutorials/eclipse/dtp/eclipse-dtp-configure-h2-datasource-using-data-source-explorer/
	public static void main(String[] args) {
		List<String> alsit=new ArrayList<String>();
		alsit.add("Nikhil");
		alsit.add("goyal");
		
		/*for(String alsit:alsit)
		{
			System.out.println(alsit);
		}*/
		SpringApplication.run(BootDemo2Application.class, args);
	}
}
