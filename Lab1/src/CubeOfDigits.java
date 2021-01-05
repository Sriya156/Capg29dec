
public class CubeOfDigits 
{
	static int Cube(int n)
	{
		int d,sum=0;
		while(n>0)
		{
			d=n%10;
			sum=sum+(d*d*d);
			n=n/10;
		}
		return sum;
		
	}
	public static void main(String args[])
	{
		int n=143;
		int p;
		p=Cube(n);
		System.out.println("Sum is:"+p);
	}

}
