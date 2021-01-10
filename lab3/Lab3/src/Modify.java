/**
 * Author: T.Sriya
 * Description: Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 * The digit in the units place can be left as it is.*/
import java.util.Scanner;
public class Modify 
{
	static int modifyNumber(int input)
	{
		String str = ""+input;
		int size = str.length();
		StringBuffer sb = new StringBuffer();
		int res = 0, temp1 = 0, temp2 = 0, temp3 = 0;
		for(int i=0; i<size-1; i++)
		{
			temp1 = str.charAt(i);
			temp2 = str.charAt(i+1);
			temp3 = temp2-temp1;
			sb.append(Math.abs(temp3));
		}
		sb.append(str.charAt(size-1));
		String s = sb.toString();
		res = Integer.parseInt(s);
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int input = sc.nextInt();
		System.out.println("Result number:"+modifyNumber(input));
		sc.close();
	}

}
