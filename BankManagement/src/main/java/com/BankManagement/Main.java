package com.BankManagement;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.BankManagement");
		BankOperation bankops = context.getBean(BankOperation.class);

		Scanner sc = new Scanner(System.in);

		while (true) {
			IO.println("\n----Bank Application----");
			IO.println("1. Deposit Amount");
			IO.println("2. Withdraw Amount");
			IO.println("3. Check Balance");
			IO.println("4. Generate Report");
			IO.println("5. Exit");
			IO.print("Enter choice of operation: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				IO.print("Enter deposit Amount: ");
				double depositAmount = sc.nextDouble();
				bankops.deposit(depositAmount);
				break;

			case 2:
				IO.print("Enter Withdraw Amount: ");
				double withdrawAmount = sc.nextDouble();
				bankops.withdraw(withdrawAmount);
				break;

			case 3:
				bankops.checkBalance();
				break;

			case 4:

				BankReport report = context.getBean(BankReport.class);
				report.generateReport();
				break;

			case 5:
				IO.println("Thank you for Using Our Application 🙏🏻");
				System.exit(0);
				break;

			default:
				IO.println("Invalid choice please Try again !");
			}

			
		}
		
	}
}
