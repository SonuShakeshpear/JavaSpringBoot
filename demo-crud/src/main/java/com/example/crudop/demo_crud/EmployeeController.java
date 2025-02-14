package com.example.crudop.demo_crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@Controller
public class EmployeeController {
	
//	public EmployeeController() {
//		System.out.println("creating instance of EmployeeController" +this);
//	}
	
	@Autowired
	DemoConfig demoConfig;
	 
	@Autowired
	DemoCrudApplication obj;
	//ArrayList<Employee> aList = new ArrayList<Employee>();
	HashMap<Integer, Employee> hMap = new HashMap<>();
	private static int count=1;
	
	@ResponseBody
	@PostMapping(value= "/createEmployee")
	public void createEmployee(@Valid  @RequestBody Employee employee) {
		System.out.println("create employee hashcode" + this);
		employee.setId(count++);
		hMap.put(employee.getId(), employee);
		
		
	}
	
	@ResponseBody
	@GetMapping(value="employee/get/all")
	public List<Employee> getAllEmployees() {
		System.out.println("from DemoConfig"+ demoConfig);
		System.out.println("from EmployeeControleer" + obj);//return (List<Employee>) hMap.values();
		System.out.println("get employee hashcode" + this);
		return hMap.values().stream().collect(Collectors.toList());
		
		
	}

}
