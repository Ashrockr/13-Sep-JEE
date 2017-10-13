package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	private static Employee [] employeeList = new Employee[10];
	static int count=0;
	@Override
	public int addEmployeeDetails(Employee employee) {
		employeeList[count++]=employee;
		return 1;
	}

	@Override
	public Employee findInsuranceScheme(Employee employee) {
		float salary = employee.getSalary();
		if (salary>=5000 && salary < 20000){
			employee.setDesignation("System Associate");
			employee.setInsuranceScheme("Scheme C");
		}
		else if (salary>=20000 && salary < 40000){
			employee.setDesignation("Programmer");
			employee.setInsuranceScheme("Scheme B");
		}
		else if (salary>=40000){
			employee.setDesignation("Manager");
			employee.setInsuranceScheme("Scheme A");
		}
		else{
			employee.setDesignation("Clerk");
			employee.setInsuranceScheme("No Scheme");
		}
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		for(int i=0;i<count;i++)
		{
			if(employeeList[i].getId()==id)
			{
				return employeeList[i];
			}
		}	
		return null;
	}

}
