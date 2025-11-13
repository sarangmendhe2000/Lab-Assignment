package com.demo.service;

public class HeapSort {
	
	private static void heapify(int arr[], int n , int i)
	{
		int left = 2*i+1;
		int right = 2*i+2;
		int largest = i;
		
		
		if(left < n  && arr[left] > arr[largest])
		{
			largest=left;
		}
		if(right < n &&  arr[right] > arr[largest])
		{
			largest = right;
		}
		
		if(largest != i)
		{
			int temp = arr[i];
			arr[i]= arr[largest];
			arr[largest]= temp;
			
			heapify(arr, n , largest);
		}
	}
	
	
	
	
	
	public static void heapSortAsc(int arr[])
	{
		
		//convert tree into max heap
		
		for(int i = (arr.length/2)-1 ; i>=0 ; i--)
		{
			heapify(arr , arr.length , i);
		}
		
		int n= arr.length;
		for(int i=n-1;i >=0;i--)
		{
			//Swap first with last
			
			int temp= arr[0];
			arr[0]= arr[i];
			arr[i]=temp;
			
			// Reconvert the tree into max heap from 1st position (0th index)
			
			heapify(arr,i,0);
		}
	}

}
