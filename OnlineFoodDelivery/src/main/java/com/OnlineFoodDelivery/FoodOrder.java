package com.OnlineFoodDelivery;

import org.springframework.stereotype.Component;

@Component
public class FoodOrder {
	
	  private DeliveryService deliveryService;

	  public FoodOrder(DeliveryService deliveryService) {
	        this.deliveryService = deliveryService;
	    }
	
	public void placeOrder() {
		IO.println("Food Order Confirmed");
		deliveryService.delivery();
	}

}
