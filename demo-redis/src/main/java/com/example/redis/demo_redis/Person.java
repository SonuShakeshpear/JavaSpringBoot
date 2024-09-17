package com.example.redis.demo_redis;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable{
	
	@Id
	private int id;
	
	@Nonnull
	private String name;
	
	@Nonnull
	private int age;
	
	private double creditScore;
	
	

}
