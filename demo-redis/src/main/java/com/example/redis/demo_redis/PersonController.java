package com.example.redis.demo_redis;


import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	private static final String PERSON_REDIS_PREFIX_STRING = "PER::";
	
	@Autowired
	RedisTemplate<String, Object> redisTemplate;
	
	@GetMapping("/key/val")
	public Person getValuePerson() {
		return null;
	}
	
	
	@PostMapping("/key/val")
	public void saveValuePerson(@Validated @RequestBody Person person, @RequestParam(value="expire", required = false) Integer expiry) {
		if(expiry == null) {
			redisTemplate.opsForValue().set(getPersonKey(person.getId()), person);
		}
		else {
			redisTemplate.opsForValue().set(getPersonKey(person.getId()), person , expiry , TimeUnit.SECONDS);
		}
		
		
	}
	
	public String getPersonKey(Integer personId) {
		return PERSON_REDIS_PREFIX_STRING + personId;
	}

}
