package com.spring_sec_proj.demo.spring_secartifact;



import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping(value="/getName")
	public String getName() {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println(auth);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("username" + user.getUsername()+ "password" +   user.getPassword());
		return "Sonu";
	}
	
	@GetMapping(value="/developer")
	public String developer() {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println(auth);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("username" + user.getUsername()+ "password" +   user.getPassword());
		return "developer";
	}
	
	@GetMapping(value="/devops")
	public String devops() {
		return "devops";
	}
	
	@PostMapping(value="/sre")
	public String sre() {
		return "devops";
	}
	
	
	@GetMapping(value="/tester")
	public String tester() {
		return "tester";
	}

}
