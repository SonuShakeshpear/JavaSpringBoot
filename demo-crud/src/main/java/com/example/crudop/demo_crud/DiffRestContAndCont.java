package com.example.crudop.demo_crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.validation.Valid;

@Controller
public class DiffRestContAndCont {
	
	@ResponseBody
	@GetMapping(value= "/getEmployee")
	public void getEmployee(@Valid  @RequestBody Employee employee) {
		System.out.println("create employee hashcode" );
	
		
		
	}

}
