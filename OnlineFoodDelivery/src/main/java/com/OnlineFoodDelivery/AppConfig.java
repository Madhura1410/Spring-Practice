package com.OnlineFoodDelivery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
	
	@Bean
	public DeliveryService deliveryService() {
		return new DeliveryService();
	}
	
	@Bean 
	public FoodOrder foodOrder(DeliveryService deliveryservice) {
		return new FoodOrder(deliveryservice);
		
	}

}
