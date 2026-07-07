package SpringCore.Program01;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	public void displayEmployee() {
		System.out.println("ID: "+employeeId);
		System.out.println("Name: "+employeeName);
		System.out.println("Salary: "+employeeSalary);
	}
	 

}
