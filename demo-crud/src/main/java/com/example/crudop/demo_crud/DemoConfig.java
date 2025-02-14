package com.example.crudop.demo_crud;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class DemoConfig {
	
	public DemoConfig() {
		System.out.println("inside democonfig constructor");
	}
	
	public String getDemoConfig() {
		return "Config:" + "This is default config. ";
 	}
	
	public String  getDemoConfigForCW() {
		return "for constructor way of dependency injection";
		
	}

}
