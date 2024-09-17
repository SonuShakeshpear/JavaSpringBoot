package com.example.OAuth2.OAuth2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2Controller {
	


	    @GetMapping("/")
	    public String index() {
	        // Return the name of the HTML file, index.html should be located in src/main/resources/static
	        return "index.html"; // No need to include ".html", Spring will resolve it automatically.
	    }



}
