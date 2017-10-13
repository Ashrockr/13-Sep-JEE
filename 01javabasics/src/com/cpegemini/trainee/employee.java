/**
 * 
 */
package com.cg.eis.bean;


/**
 * @author aspaliwa
 *
 */
public class Employee {
	protected int id;
	protected String name;
	protected float salary;
	protected String designation;
	protected String insuranceScheme;
	private static int numId=1000;
	
	{
		id = numId++;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return    "\n     Employee Details "
				+ "\n id               : " + id 
				+ "\n Name             : " + name 
				+ "\n Salary           : " + salary
				+ "\n Designation      : " + designation 
				+ "\n Insurance Scheme : " + insuranceScheme ;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee employee = (Employee) obj;
			if ((this.id == employee.id) && (this.name == employee.name)
				&& (this.salary == employee.salary) && (this.designation == employee.designation)
				&& (this.insuranceScheme == employee.insuranceScheme)) {
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	
	
}
