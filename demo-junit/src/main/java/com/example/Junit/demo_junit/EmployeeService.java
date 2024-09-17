package com.example.Junit.demo_junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
