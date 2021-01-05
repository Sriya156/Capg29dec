import java.util.*;
public class TrafficLight 
{
	static String Traffic(String str)
	{
		switch(str)
		{
			case "Red":
					return "Stop";
			case "Yellow":
					return "Ready";
			case "Green":
					return "Go";
		}	
		return null;
	}
	public static void main(String args[])
	{
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.next();
		System.out.println(Traffic(str));
			
	}
}
