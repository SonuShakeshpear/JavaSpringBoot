package com.example.springsecurity.springsecurity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Value("${user.authority.developer}")
	private String DEVELOPER_AUTHORITY;
	
	@Value("${user.authority.devops}")
	private String DEVOPS_AUTHORITY;
	
	@PostMapping(value= "/createNewUser")
	public void createNewUser(@Validated @RequestBody UserCreateRequest userCreateRequest) {
		MyUser myUser = MyUser.builder()
						.username(userCreateRequest.getUsername())
						.password(passwordEncoder.encode(userCreateRequest.getPassword()))
						.authorities(userCreateRequest.getIsDeveloper()? DEVELOPER_AUTHORITY : DEVOPS_AUTHORITY )
						.build();
		
		userService.createNewUser(myUser);
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
	
	@GetMapping(value="/developer")
	public String developer() {
		
		
		return "developer";
	}

}
