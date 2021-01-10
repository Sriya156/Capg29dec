/**
 *  Author-T.Sriya
 * Description: Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol .
 * Logic:-Accepts One String.Find the mirror image of the String.Add the two Strings 
 * together separated by a pipe(|) symbol
*/
import java.util.Scanner;

public class Mirror 
{
	static String getImage(String str)
	{
		String res = str+"|";
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();
		res+= sb;
		return res;
	}
	
	public static void main(String[] args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string:");
		str = sc.next();
		System.out.print("Result string:"+getImage(str));
		sc.close();
		
	}
}
