/*Author : T.Sriya*/
/* Create a method which accepts an integer array and returns the second smallest element in the array.
 * getSecond Smallest function is used to return the second smallest element of the array.
 */
package com.cg.Lab22;

import java.util.Scanner;

public class SecondSmallestElement 
{
	static int getSecondSmallest(int arr[])
	{
		int temp,j=0,i;
		int size=arr.length;
		if(size==0) 
		{
			return 0;
		}
		if(size==1)
		{
			return 1;
		}
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[1];
	}
	public static void main(String args[])
	{
		int size,i,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the numbers");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		p=getSecondSmallest(arr);
		for(i=0;i<size;i++)
		{
			System.out.println(p);
		}
	}

}
