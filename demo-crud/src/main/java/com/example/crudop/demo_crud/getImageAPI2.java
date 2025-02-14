package com.example.crudop.demo_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class getImageAPI2 {
	@Autowired
	@Qualifier("Bean2")
	RestTemplate rt;
	
	@GetMapping(value="/getImageById2", produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] getImageByID2(@RequestParam("id") int id, @RequestParam("l") int l, @RequestParam("b") int b) {
		String url = "https://picsum.photos/id/"+ id+ "/"+l+"/"+b;
		
		
		byte[] response = rt.getForObject(url, byte[].class);
		return response;
		
		
	}

}
