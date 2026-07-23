package com.ParkingManagementSystem;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ParkingReport {
	
	public void report() {
		   System.out.println("\nReading parking records...");
	        System.out.println("Calculating Revenue...");
	        System.out.println("Generating PDF...");
	        System.out.println("Saving Report into Database...");
	        System.out.println("Daily Parking Report Generated Successfully.");
	}

}
