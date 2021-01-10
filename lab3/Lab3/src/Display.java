/**
 * Author- T.Sriya
 * Description: Write a Java program that displays the number of characters, lines and words in a text
 */
import java.util.Scanner;

public class Display
{

	public static void main(String[] args)
	{
		
		String input = new String();
		Scanner sc = new Scanner(System.in);
		int  characters = 0;
		
		System.out.println("Enter String:");
		input = sc.nextLine();
		
		System.out.println("Entered Sring:"+input);
		
		String[] lines = input.split("\r\n|\r|\n");
		System.out.println("Number of lines:"+lines.length);
		
		String[] words = input.split(" ");
		System.out.println("Number of words:"+words.length);
		
		for(int i = 0; i < input.length(); i++) 
		{    
            if(input.charAt(i) != ' ')    
            	characters++;    
        }    
		System.out.println("Number of characters:"+characters);
		sc.close();
	}

}