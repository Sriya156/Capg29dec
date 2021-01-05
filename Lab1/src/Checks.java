public class Checks
{
	static boolean checkNumber(int n)
	{
		if(n==0)
		{
			return false;
		}
		while(n!=1) 
		{
			n=n/2;
			if(n%2 !=0 && n!=1)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int n=128;
		boolean s=checkNumber(n);
		if(s==true)
		{
		System.out.println("It is power of 2");
		}
		else
		{
			System.out.println("It is not power of 2");
		}
}
}
	
