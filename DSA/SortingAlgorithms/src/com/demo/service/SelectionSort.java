package com.demo.service;

public class SelectionSort {
	
	
	public static int findNthminimum(int[]arr , int start)
	{
		int minpos = start;
		int min = arr[minpos];
		
		for(int i=start;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				minpos=i;
				min=arr[i];
			}
		}
		return minpos;
	}
	
	public static void selectionSortAsc(int [] arr)
	{
		for(int i=0 ; i<arr.length-1;i++)
		{
			int minPos = findNthminimum(arr,i);
			
			int temp = arr[i];
			arr[i]=arr[minPos];
			arr[minPos]=temp;
		}
	}

}
