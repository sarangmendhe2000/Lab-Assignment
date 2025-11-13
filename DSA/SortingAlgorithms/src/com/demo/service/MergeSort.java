package com.demo.service;

public class MergeSort {
	
	
	public static void merge(int[] arr , int start , int mid ,int end)
	{
		int [] arr1 = new int[end-start+1];
		int i = start;
		int j= mid+1;
		int k= start;
		
		while(i<=mid && j<=end)
		{
			if(arr[i]<=arr[j])
			{
				arr1[k-start]= arr[i];
				i++;
				k++;
			}
			else
			{
				arr1[k-start]= arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid)
		{
			while(j<=end)
			{
				arr1[k-start] = arr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				arr1[k-start]= arr[i];
				i++;
				k++;
			}
		}
		
//		for(k=start ; k<=end;k++)
//		{
//			arr[start+k]= arr1[k];
//		}
		
		for(int m=0;m<arr1.length;m++)
		{
			arr[start+m]= arr1[m];
		}
		
	}
	
	public static void mergeSortAsc(int[]arr, int start , int end)
	{
		int mid;
		if(start<end)
		{
			mid= (start+end)/2;
			
			mergeSortAsc(arr,start,mid);
			mergeSortAsc(arr,mid+1,end);
			merge(arr, start, mid,end);
			
		}
		
	}

}
