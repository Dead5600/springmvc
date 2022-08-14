package com.springmvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
		
	// By using model we are adding data dynamically
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Omkar");
		model.addAttribute("id", 1222);
		List<String> city = new ArrayList<String>();
		city.add("kolhapur");
		city.add("mummbai");
		city.add("pune");
		city.add("goa");
		
		model.addAttribute("c1",city);
		
		System.out.println("home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("about url");
		return "about";
	}
	
	@RequestMapping("/service")
	public String services() {
		System.out.println("service url");
		return "service";
	}
	
	@RequestMapping("/page/{userId}")
	public String getPage(@PathVariable("userId") int userId) {
		String s1 = null;
		System.out.println(userId);
		System.out.println(s1.length());
		return "contact";
	}
	
	//By using ModelAndView we are adding data dynamically
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("help url");
		ModelAndView m1 = new ModelAndView();
		m1.addObject("name", "Sanket");
		m1.addObject("RollNum",544);
		LocalDateTime now = LocalDateTime.now();
		m1.addObject("Time", now);
		
		m1.setViewName("help");
		
		return m1;
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
	ModelAndView mv= new ModelAndView();
	mv.addObject("name", "name");
	mv.setViewName("welcome");
		return mv;
	}

	
	/***********************************************************/
			// Exception Handling for single controller
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
