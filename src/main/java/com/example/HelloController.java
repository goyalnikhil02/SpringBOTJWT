package com.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/hello")
public class HelloController {
	
	//  private final Logger log = LoggerFactory.getLogger(this.getClass());
	  
	@RequestMapping("/hello")
	public String index() {
		/*log.debug("debug level log");
	    log.info("info level log");
	    log.error("error level log");
*/
	    
		return "Greetings from v  Spring Boot!";
	}
	
	 @GetMapping
	    public String hello() {
	        return "Hello World";
	    }
}
