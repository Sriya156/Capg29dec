/**Author: T.Sriya
 * EmployeeService is used to create the function userInput which is called in the driver class.
 */
package com.cg.eis.services;

public interface EmployeeService
{
	default void userInput(int id, String name, double salary, String designation)
	{
		
	}
	default void showData()
	{ 
		
	}
	default String FindInsuranceSchema(double sal, String designation)
	{
		return "";
	}
}

