/**Author T.Sriya
 *Description: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 *Logic:-Return the String replacing all the consonants with the next character. 
 */
import java.util.Scanner;

public class Alphabet 
{
	static String alterString(String str)
	{
		StringBuffer sb = new StringBuffer();
		int size = str.length();
		for(int i = 0; i<size; i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
			{
				sb.append(ch);
			}
			else
			{
				sb.append(++ch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = sc.next();
		System.out.println("Result String:"+alterString(str));
		sc.close();
	}

}
