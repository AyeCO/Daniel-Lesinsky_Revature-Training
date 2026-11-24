package week2.day4.filehandling;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int empId;
	String empName;
	String department;
	double salary;
	
	Employee(int empId, String empName, String department, double salary){
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee id: " + empId
				+ "\nName: empName: " + empName
				+ "\nDepartment: " + department
				+ "\nSalary= " + salary
				+ "\n";
	}
	
	
}

