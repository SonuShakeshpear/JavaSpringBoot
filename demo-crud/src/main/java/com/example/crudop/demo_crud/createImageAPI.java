package com.example.crudop.demo_crud;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class createImageAPI {
	
	@GetMapping(value="/getImagebyId", produces =  MediaType.IMAGE_PNG_VALUE)
	public byte[] getImage(@RequestParam("id") int id, @RequestParam("l") int l, @RequestParam("b") int b) {
		String url = "https://picsum.photos/id/"+ id+ "/"+l+"/"+b;
		
		RestTemplate rt = new RestTemplate();
		byte[] response =  rt.getForObject(url, byte[].class);
		return response;
		
	}

}
