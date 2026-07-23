package com.ParkingManagementSystem;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ParkingManagementSystem");
		ParkingOperation opt = context.getBean(ParkingOperation.class);

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n===== Smart Parking Management =====");
			System.out.println("1. Vehicle Entry");
			System.out.println("2. Vehicle Exit");
			System.out.println("3. Show Available Parking Slots");
			System.out.println("4. Generate Daily Parking Report");
			System.out.println("5. Exit");

			IO.print("Enter operation to do : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				opt.vehicleEntry();
				break;
			case 2:
				opt.vehicleExit();
				break;
			case 3:
				opt.showSlots();
				break;
			case 4:
				ParkingReport report = context.getBean(ParkingReport.class);
				report.report();
				break;
			case 5:
				System.out.println("Thank You");
				sc.close();
				System.exit(0);

			default:

				System.out.println("Invalid Choice");
			}
		}
	}
}
