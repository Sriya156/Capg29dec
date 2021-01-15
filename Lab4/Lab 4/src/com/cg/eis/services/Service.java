/**Author: T.Sriya
 * Service class is used to define the methods desired in the question.
 */
package com.cg.eis.services;

import com.cg.eis.bean.Employee;

public class Service implements EmployeeService
{
	Employee emp = new Employee();
	
	@Override
	public void userInput(int id, String name, double salary, String designation)
	{
		emp.setId(id); 
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDesignation(designation);
	}

	public void showData()
	{
		System.out.println("\nEmployee details:");
		System.out.println("Name             :"+emp.getName());
		System.out.println("ID               :"+emp.getId());
		System.out.println("Salary           :"+emp.getSalary());
		System.out.println("Designation      :"+emp.getDesignation());
		System.out.println("Insurence Schema :"+FindInsuranceSchema(emp.getSalary(), emp.getDesignation()) );
	}

	@Override
	public String FindInsuranceSchema(double sal, String designation)
	{
		// logic for finding Insurance Schema
		return null;
	}


}
