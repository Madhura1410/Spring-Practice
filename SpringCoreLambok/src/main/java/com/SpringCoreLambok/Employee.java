package com.SpringCoreLambok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private Department department;
	
}
