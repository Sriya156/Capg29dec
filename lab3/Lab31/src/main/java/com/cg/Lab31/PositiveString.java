/**Author-T.Sriya
 * Description: Create a method that accepts string and checks whether it is a positive string or not.
 * For Example: ANT is a positive string because they are in an alphabetical order.
 */
package com.cg.Lab31;
import java.util.Scanner;
public class PositiveString
{
	static boolean isPositiveString(String ip)
	{
		ip = ip.toUpperCase();
		int size = ip.length();
		int []arr = new int[size];
		char ch;
		for(int i = 0; i<size; i++)
		{
			ch = ip.charAt(i);
			arr[i] = ch;
		}
		for(int i = 0; i<size-1; i++)
		{
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
		
	}
	public static void main(String[] args)
	{
		String ip = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string:");
		
		ip = sc.next();
		if(isPositiveString(ip))
		{
			System.out.println("\""+ip+"\" is a positive String");
		}
		else
		{
			System.out.println("\""+ip+"\" is a not a positive String");
		}
		sc.close();
	}
}
