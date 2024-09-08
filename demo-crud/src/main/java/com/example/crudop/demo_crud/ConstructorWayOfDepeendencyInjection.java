package com.example.crudop.demo_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorWayOfDepeendencyInjection {
	
	@Value("${jbdl.batch.number}")
	int batchnumber;
	
	//@Autowired
	DemoConfig demoConfig;
	ChildClass childClass;
	
	
	@Autowired
	public ConstructorWayOfDepeendencyInjection(DemoConfig demo, @Value("${batch.lecture.number}") int lect) {
		this.demoConfig=demo;
		
		System.out.println("Constructor injection "+ batchnumber +" "+ lect);
	}
	
	public ConstructorWayOfDepeendencyInjection(ChildClass child) {
		this.childClass=child;
	}
	
	@GetMapping(value="/getNameByDetails")
	public String getNameByDetails() {
		return "getNameByDetails "+ demoConfig.getDemoConfigForCW();
	}

}
