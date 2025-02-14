package com.example.crudop.demo_crud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
//	public PersonController() {
//		System.out.println("creating instance of EmployeeController" +this);
//	}
	
	@Autowired
	DemoCrudApplication obj;
	
	@Autowired
	DemoConfig demoConfig;
	
	private static Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@GetMapping(value="/getNameDetails")
	public String getNameDetails() {
		
		System.out.println("from Personontroleer" + obj);
		System.out.println("from this block" + this);
		logger.trace("logger info from personcontroller class");
		logger.debug("logger info from personcontroller class");
		logger.info("logger info from personcontroller class");
		logger.warn("logger info from personcontroller class");
		logger.error("logger info from personcontroller class");
		return "GetNameDetails Sonu Shakeshpear";
	}
	
	
	@GetMapping(value="/getBeanScopeExample")
	public String getBeanScope() {
		System.out.println("from democonfig" + demoConfig);
		System.out.println(demoConfig.getDemoConfig());
		return "bean scope";
	}

}
