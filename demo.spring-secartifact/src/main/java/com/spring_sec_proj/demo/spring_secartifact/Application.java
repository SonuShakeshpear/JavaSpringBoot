package com.spring_sec_proj.demo.spring_secartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
		System.out.println(bcp.encode("try@123"));
		System.out.println(bcp.encode("try@321"));
		System.out.println(bcp.encode("chhoti@123"));
	}

}
