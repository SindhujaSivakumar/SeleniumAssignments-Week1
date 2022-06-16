package week1.day2;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employee Name: "+empName + "Employee ID: "+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee Address: "+ empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee Salary: "+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Emp Mobile Num: "+ mobNum);
	}

	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.printEmployeeName("Rob", 1001);
		emp.getEmployeeAddress("5, Big Street, Chennai");
		emp.printEmployeeSalary(100564.78);
		emp.printEmployeeMobileNumber(7854238934L);
	}
}
