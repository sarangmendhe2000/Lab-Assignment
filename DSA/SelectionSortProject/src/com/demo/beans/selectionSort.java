package com.demo.beans;

import java.util.Arrays;

public class selectionSort {
	
	public static void selectionSortAscending(int [] arr) {
		
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			int minIndex=i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		
	}
	
	public static void selectionSortDescending(int[] arr) {
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			int maxIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[maxIndex]) {
					maxIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[maxIndex];
			arr[maxIndex]=temp;
		}
	
	}

	public static int findNthMax(int[] arr) {
		 
		 int maxIdx= -1;
		 for(int i=0; i<arr.length; i++) {
		  maxIdx = findNthMax( arr,i,arr.length);
			 
			  int temp = arr[i];
			  arr[i]= arr[ maxIdx];
			  arr[maxIdx]= temp;
			  
	 }
	 System.out.println("max number: "+arr[ maxIdx]);
	 return arr[maxIdx];
		
	}

	private static int findNthMax(int[] arr, int i, int length) {
		
		return 0;
	}
}

	

