/**Author: T.Sriya
 * Driver class is used to take the input of name,age,salary and throw an exception in case of errors.
 */
package com.cg.eis.exception;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args) throws EmployeeException
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		int age = 0;
		int sal = 0;
		String fname = "", lname = "";
		try
		{
			//Question 1
			System.out.print("\nEnter age:");
			age = sc.nextInt();
			if(age <= 15)
			{
				throw new EmployeeException("\nAge must be above 15.");
			}
			//Question 2
			System.out.print("\nEnter first name:");
			fname = scs.nextLine();
			System.out.print("\nEnter last name:");
			lname = scs.nextLine();
			if( fname.isEmpty() &&  lname.isEmpty() )
			{
				throw new EmployeeException("\nPlease enter a vaild name.");
			}
			
			//question 3
			System.out.print("\nEnter salary:");
			sal = sc.nextInt();
			if(sal < 3000)
			{
				throw new EmployeeException("\nSalary must be grather then Rs.3000.");
			}
		}
	
		catch(Exception e)
		{
			System.out.println(e.getMessage()); 
		}
		
		finally
		{
			sc.close();
			scs.close();
		}
		System.out.println("Age is:"+age);
		System.out.println("First Name:"+fname);
		System.out.println("Last Name:"+lname);
		System.out.println("Salary:"+sal);
	}

}
