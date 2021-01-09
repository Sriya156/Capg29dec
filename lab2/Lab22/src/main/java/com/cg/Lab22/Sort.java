/*Author : T.Sriya*/
/* Create a method that can accept array of string objects and sort it in alphabetical order.Elements in 
 * the left half should be in uppercase and the right half should be in lower case.
 * SortStrings function is used to to arrange the right half elements as uppercse and left half as lower case.
 */
package com.cg.Lab22;

import java.util.Arrays;

public class Sort {
	public String[] sortStrings(String[] string) throws Exception {
		int length = string.length;
		String result[] = new String[length];

		if(length==0)
		{
		throw new Exception("NoInputException");
		}

		else if(length==1)
		{
		result[0]=string[0].toUpperCase();
		return result;
		}

		else
		{
		Arrays.sort(string);
		for(int i =0;i<length ; i++)
		{
		if(length%2==0)
		{
		if(i<length/2)
		{
		result[i]=string[i].toUpperCase();
		   }
		   else
		result[i]=string[i].toLowerCase();
		       }
		else
		{
		if(i<length/2+1)
		{
		result[i]=string[i].toUpperCase();
		}
		else
		result[i]=string[i].toLowerCase();
		}
		}


		return result;
		}

		}
}
