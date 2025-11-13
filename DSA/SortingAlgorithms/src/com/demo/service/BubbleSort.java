package com.demo.service;

import java.util.Arrays;

public class BubbleSort {
	
	private int arr[];
	
	
	public BubbleSort()
	{
		arr= new int[7];
	}
	
	
	public static void bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void modifiedBubbleSort(int arr[])
	{
		
		int totalSwap=0;
		for(int i=0;i<arr.length;i++)
		{
			int count = 0 ;
			boolean swap = false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					swap = true;
					count++;
				}
			}
			if(!swap)
			{
				break;
			}
			System.out.println("Iteration - " + (i+1)+ "   Swapping = "+count);
			totalSwap+=count;
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("Total number of swapping  - " + totalSwap);
		
	}
	
	public static void modifiedBubbleSortDesc(int arr[])
	{
		
		int totalSwap=0;
		for(int i=0;i<arr.length;i++)
		{
			int count = 0 ;
			boolean swap = false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					swap = true;
					count++;
				}
			}
			if(!swap)
			{
				break;
			}
			System.out.println();
			System.out.println("Iteration - " + (i+1)+ "   Swapping = "+count);
			
			totalSwap+=count;
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("Total number of swapping  - " + totalSwap);
		
	}

}
