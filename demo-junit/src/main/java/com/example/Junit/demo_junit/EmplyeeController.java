package com.example.Junit.demo_junit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/api/employees")
public class EmplyeeController {
	
	private EmployeeService employeeService;
	
	public EmplyeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee creatEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
		
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
		return  employeeService.getEmployeeById(employeeId)
				.map(ResponseEntity::ok)
				.orElseGet(()->ResponseEntity.notFound().build());
		
	}

}
