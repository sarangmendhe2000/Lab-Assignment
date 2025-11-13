package com.demo.service;

public class QuickSort {

	
	public static int partition(int arr[] , int start , int end )
	{
		int pivot = start; 
		int i = start;
		int j= end;
		
		while(i<j)
		{
			
		
		while(arr[i]<=arr[pivot] && i<end)
		{
			i++;
		}
		while(arr[j]>arr[pivot] && j>start)
		{
			j--;
		}
		if(i<j)
		{
			
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
		
		}
		}
		
		if(pivot!=j)
		{
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j]= temp;
		}
		
		return j;
		
	}
	
	public static void quickSortAsc(int [] arr , int start , int end)
	{
		if(start<end)
		{
			int p = partition(arr , start , end);
			quickSortAsc(arr, start , p-1);
			quickSortAsc(arr,p+1 , end);
		}
	}

}
