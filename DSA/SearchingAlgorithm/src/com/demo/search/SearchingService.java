package com.demo.search;

public class SearchingService {
	
	public static int binarySearch(int arr[] , int val)
	{
		int low = 0 ; 
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			
			if(arr[mid] == val)
			{
				return mid;
			}
			else if(val < arr[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return -1;
	}
	
	public static int binarySearchRecursive(int arr[], int search , int low , int high)
	{
		if(low<=high)
		{
		
		int mid = (low+high)/2;
		
		if(arr[mid] == search)
		{
			return mid;
		}
		
		else if(arr[mid]>search)
		{
			return binarySearchRecursive( arr , search , low , mid-1);
		}
		else
		{
			return binarySearchRecursive( arr , search , mid+1 , high );
		}
		}
		return -1;
	}
	

	

}
