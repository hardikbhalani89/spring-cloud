package com.hb.orderservice.constants;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "order")
public class OrderConfig {

	private String orderEndpoint;

	public String getOrderEndpoint() {
		return orderEndpoint;
	}

	public void setOrderEndpoint(String orderEndpoint) {
		this.orderEndpoint = orderEndpoint;
	}
	
}
