/*package com.example;

import org.assertj.core.util.Throwables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

	//http://spr.com/part-5-integrating-spring-security-with-spring-boot-web/
	
	  private final Logger log = LoggerFactory.getLogger(this.getClass());
		
	
	@ExceptionHandler(value = NullPointerException.class)
	public ExceptionProp exceptionNull(Exception ex, WebRequest request) {
		//ModelAndView modelAndView = new ModelAndView("error/general");
		//modelAndView.addObject("errorMessage", Throwables.getRootCause(exception));
		log.info("INside the null pointer");
		ExceptionProp exe=new ExceptionProp();
		exe.setName("Null Pointer");
		exe.setTrace(ex.getStackTrace()+"");
		return exe;//"Null pointer "+request.getContextPath();
	}
	
	@ExceptionHandler(value = Exception.class)
	public String exception(Exception exception, WebRequest request) {
		ModelAndView modelAndView = new ModelAndView("error/general");
		modelAndView.addObject("errorMessage", Throwables.getRootCause(exception));
		return "error";
	}
	
	

}
*/