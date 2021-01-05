import java.util.*;
import java.math.*;
public class Prime 
{
	static boolean IsPrime(int n)
	{
		int i,j,c=0;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i;
		for(i=2;i<=n;i++)
		{
			if(IsPrime(i))
			{
				System.out.println(i+" ");
			}
		}
	}
}
