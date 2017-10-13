/**
 * 
 */
package com.cg.eis.service;

import com.cg.eis.bean.Employee;

/**
 * @author aspaliwa
 *
 */
public interface IEmployeeService {
	public int addEmployeeDetails(Employee employee);
	public Employee findInsuranceScheme(Employee employee);
	public Employee searchEmployee(int id);
}
