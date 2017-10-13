/**
 * 
 */
package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.service.IEmployeeService;

/**
 * @author aspaliwa
 *
 */
public class EmployeeClient {

	static IEmployeeService employeeService = new EmployeeServiceImpl();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int option;
		do{
		System.out.print(
				  "\n_________________________________________"
				+ "\n    Employee Insurance System           "
				+ "\n________________________________________"
				+ "\n    Enter your option                   "
				+ "\n 1. Add Employee Details                "
				+ "\n 2. Find Insurance Scheme               "
				+ "\n 3. Display details of Employee"
				+ "\n 4. Exit             "
				+ "\n________________________________________" 
				+ "\n Option: ");
		option = sc.nextInt();
		switch (option) {
		case 1:addEmployee();			
			break;
		case 2:getScheme();			
			break;
		case 3:displayDetails();			
			break;
		case 4:exitEIS();			
			break;
		default:
			System.out.println("\nPlease select the correct option (1-4) only.");
			break;
		}
		}while(true);
	}
	private static void exitEIS() {
		System.out.println("\n Thankyou for using Employee Insurance System"
						 + "\n           Do visit Again!!!");
		sc.close();
		System.exit(0);
	}
	private static void displayDetails() {
		System.out.print("\n Enter the Employee Id : ");
		int id = sc.nextInt();
		Employee employee = employeeService.searchEmployee(id);
		if(employee!=null){
			System.out.println(employee);
		}
		else{
			System.out.println("\n No Employee found with the id : "+id);
		}
		
	}
	private static void getScheme() {
		System.out.print("\n Enter the Employee Id : ");
		int id = sc.nextInt();
		Employee employee = employeeService.searchEmployee(id);
		if(employee!=null){
			employee = employeeService.findInsuranceScheme(employee);
			System.out.println("\n Insurance Scheme : " + employee.getInsuranceScheme());
		}
		else{
			System.out.println("\n No Employee found with the id : "+id);
		}
	}
	private static void addEmployee() {
		Employee employee=new Employee();
		System.out.print("\n Enter the Employee name : ");
		employee.setName(sc.next());
		System.out.print("\n Enter the salary of the Employee : ");
		employee.setSalary(Float.parseFloat(sc.next()));
		int status;
		employee = employeeService.findInsuranceScheme(employee);
		status = employeeService.addEmployeeDetails(employee);
		if(status==1){
			System.out.println("\n Employee Added Successfully!!");
		}
		else{
			System.out.println("\n Employee is not added!"
							 + "\n   Error has occured!!");
		}
		
	}

}
