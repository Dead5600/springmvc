package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("Inside contact......");
		String s1 = null;
		System.out.println(s1.charAt(2));
		return "contact";
	}
	
	@RequestMapping(path ="/details" , method = RequestMethod.POST)
	public String details(@ModelAttribute  User user, Model model) {
		System.out.println(user);
		return "details";
	}
	
/*	public String details(@RequestParam("email") String userEmail, 
			@RequestParam("username") String userName,
			@RequestParam("userpassword") String password, Model m1) {
		
		System.out.println(userEmail);
		System.out.println(userName);
		System.out.println(password);
		m1.addAttribute("name",userName );
		m1.addAttribute("email",userEmail);
		m1.addAttribute("password", password);
		return "details";
	}			*/
	

}
