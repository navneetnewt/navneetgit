package com.spring.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservices.limitsservice.Configuration;
import com.spring.microservices.limitsservice.bean.LimitsConfiguration;

@RestController
public class LimitControllerConfiguration {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration retriveLimitsFromConfigurations() {
		
		return new LimitsConfiguration(configuration.getMaximum(), configuration.getMinimum());
		
	}
}
