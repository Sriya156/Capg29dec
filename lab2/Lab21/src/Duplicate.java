
/*Author : T.Sriya*/
/* Create a method which accepts an integer array and removes all duplicates in the array and result the
 *  remaining array in descending order.
 *  isPresent method is used to check for the presence of an element and modify array is used to remove 
 *  duplicates and arranging in a descending order   */

import java.util.Scanner;

public class Duplicate
{
	static boolean isPresent(int[] arr, int temp)
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(temp == arr[i])
			{
				return true;
			}
		}
		return false;
	}
	
	static int[] modifyArray(int[] num)
	{
		int size = num.length;
		int[] uni = new int[size]; 
		int j = 0, temp = 0;
		
		for(int i = 0; i<size; i++)
		{
			temp = num[i];
			if(!(isPresent(uni, temp)))
			{
				uni[j] = temp;
				j++;
			}
		}
		size = j;
		int[] unique = new int[size];
		for(int i = 0; i<size; i++)
		{
			unique[i] = uni[i];
		}
		
		System.out.print("Unique array:");
		for(int i = 0; i<size; i++)
		{
			System.out.print(unique[i]+" ");
		}
		temp = 0;
		for(int i = 0; i<size-1; i++)
		{
			for(int k = 0; k<(size-i-1); k++)
			{
				if(unique[k] < unique[k+1])
				{
					temp = unique[k];
					unique[k] = unique[k+1];
					unique[k+1] = temp;
				}
			}
		}
		return unique;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size:");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.print("Enter the array:");
		for(int i = 0; i<size; i++)
		{
			num[i] = sc.nextInt();
		}
		int[] res = modifyArray(num);
		System.out.print("\nResult number:");
		for(int i = 0; i<res.length; i++)
		{
			System.out.print(res[i]+" ");
		}
		sc.close();
	}

}
