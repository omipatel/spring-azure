package com.azure.net.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AzureController {
	
	
	    @GetMapping("/message")
	    public String getMessage() {
	    	 
	    	return "Spring Boot Deployee in Azure, i am developer";
	    }
	    @GetMapping("/sms")
	    public String getSMS() {
	    	 
	    	return "Try to understand the flow ";
	    }
	
	
	
	

}
