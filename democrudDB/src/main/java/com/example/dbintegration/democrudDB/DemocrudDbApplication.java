package com.example.dbintegration.democrudDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemocrudDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocrudDbApplication.class, args);
	}

}
