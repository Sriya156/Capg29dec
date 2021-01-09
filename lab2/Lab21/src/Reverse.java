/*Author : T.Sriya*/
/* Create a method which accepts an integer array,reverse the numbers in the array and returns the array 
 * in a sorted manner.
 * getSorted function is used to reverse the numbers and to sort the array.
 */
import java.util.Scanner;
public class Reverse 
{

	static int[] getSorted(int arr[])
	{
		int size,i,d=0,j,temp;
		size=arr.length;
		String res="";
		int result[]=new int[size];
		for(i=0;i<size;i++)
		{
			res="";
			while(arr[i]>0)
			{
				d=arr[i]%10;
				res=res+d;
				arr[i]=arr[i]/10;
			}
			result[i]=Integer.parseInt(res);
		}
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(result[j]>result[j+1])
				{
					temp=result[j];
					result[j]=result[j+1];
					result[j+1]=temp;
				}
			}
		}
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		int []res = new int[size];
		
		System.out.println("\nEnter the array:");
		for(int i =0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		res = getSorted(arr);
		
		System.out.println("\nResult sorted array:");
		for(int i =0; i<size; i++)
		{
			System.out.print(res[i]+"  ");
		}
		sc.close();
	}
}
