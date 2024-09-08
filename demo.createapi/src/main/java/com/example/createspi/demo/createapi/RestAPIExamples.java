package com.example.createspi.demo.createapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestAPIExamples {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(RestAPIExamples.class, args);
	}

	
	
	@GetMapping(value = "/getName")
	public String getName() {
		return "Sonu + Ranu + Chandni + Sweety + Chhoti" ;
		
	}
	
	
	@GetMapping(value="/getName123")
	public String getName123(@RequestParam("reqname") String name) {
		return name+ " by request parameter";
		
	}
	
	@GetMapping(value="/getName456/{myVar}")
	public String getName456(@PathVariable("myVar") String name) {
		return name + "by path variable";
	}
	
	
	@GetMapping(value= "/getName789/{myVar}")
	public String getName789(@PathVariable("myVar") String name, @RequestParam("reqname") String name2) {
		return name +" by path variable" + name2 + "by request param ";
		
	}
	
	
	
	
	
	
	
	
	/*
	@GetMapping(value = "/getName123/{myVar}")
	public String getName123(@PathVariable("myVar") String name) {
		return name + " by path varibable";
	}
	

	@GetMapping(value = "/getName456")
	public String getName456(@RequestParam("name") String name) {
		return name + " by request parameter";
	}
	*/
	
	@PostMapping(value = "/postName")
	public String postName() {
		return "Sunita";
		
	}
	
	@PutMapping
	public String putName() {
		return "Sonu is failed " ;
		
	}
	
	@PatchMapping
	public String patchName() {
		return "Hope for the best!!" ;
		
	}

}
