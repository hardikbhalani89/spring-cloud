package com.hb.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hb.orderservice.constants.OrderConfig;

@RefreshScope
@RestController
@Configuration
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "order")
public class OrderController {

	@Autowired
	OrderConfig orderConfig;
	
	
	private String ii;

	public String getIi() {
		return ii;
	}

	public void setIi(String ii) {
		this.ii = ii;
	}

	@GetMapping("/getOrder")
	public String getData() {
		System.out.println(orderConfig.getOrderEndpoint());
		return "Hello "+orderConfig.getOrderEndpoint();
	}
}
