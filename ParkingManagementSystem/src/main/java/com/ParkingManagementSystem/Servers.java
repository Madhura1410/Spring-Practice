package com.ParkingManagementSystem;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("servers")
public class Servers {
	
	@PostConstruct
	public void process() {
		IO.println("🚧 Activate Parking Gate Sensors");
		IO.println("📷 Initialize CCTV Cameras");
		IO.println("💳 Connect Payment Gateway");
		IO.println(" 🖥️ Start Vehicle Detection System");
		IO.println("✅ Display \"Parking System Ready\"");
	}

}
