package com.example.crudop.demo_crud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DemoConfigImageAPI2 {
	
	@Bean("Bean1")
	//@Primary
	public RestTemplate restTemplate() {
		System.out.println("from resttemplate1 function");
		return new RestTemplate();
		
	}
	
	@Bean("Bean2")
	public RestTemplate restTemplate2() {
		System.out.println("from resttemplate2 function");
		return new RestTemplate();
	}
	
	public DemoConfigImageAPI2() {
		System.out.println("inside democonfig constructor");
	}
	
	public String getDemoConfigImageAPI2() {
		return "Config:" + "This is default config. ";
 	}

}
