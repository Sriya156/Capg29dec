/** 
* Author: T.Sriya
* Description : Java program that reads a line of integers and then displays each integer and the sum of all integers.
*  (Use String Tokenizer class)
*/
package com.cg.Lab31;
import java.util.StringTokenizer; 
public class SumOfIntegers1
{
	static int SumOfIntegers(String str) 
	{
		StringTokenizer st = new StringTokenizer(str);
		int sum = 0;
		String temp = "";
		System.out.println("Elements:");
		while(st.hasMoreTokens())
		{
			temp = st.nextToken();
			System.out.print(temp+" ");
			sum+=Integer.parseInt(temp);
		}
		
		return sum;
	}


	public static void main(String[] args)
	{
		String str = "";
		for(String s : args)
		{
			str+=s+" ";
		}
		System.out.println("\nSum:"+SumOfIntegers(str));
	}
}