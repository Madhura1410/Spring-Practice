package SpringCore1.Program02;

public class Employee2 {
	
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	



	public Employee2(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}





	public void displayEmployee() {
		System.out.println("ID: "+employeeId);
		System.out.println("Name: "+employeeName);
		System.out.println("Salary: "+employeeSalary);
	}
	 

}
