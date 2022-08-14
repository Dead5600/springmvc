package com.springmvc;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String nullExceptionHandler(Model m) {
		m.addAttribute("msg" ,"Null Pointer Exception Occured...");
		
		return "handle";
	}
	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String numberFormatExceptionHandler(Model m) {
		m.addAttribute("msg" ,"Number Format Exception Occured...");
		
		return "handle";
	}
	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Model m) {
		m.addAttribute("msg" ," Exception Occured...");
		
		return "handle";
	}


}
