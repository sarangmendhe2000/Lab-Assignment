package com.demo.beans;

import java.util.Arrays;

public class bubbleSort {
	public static void sortAscending (int[] arr) {
		
		int n = arr.length;
		for( int i= 0 ; i<n-1 ; i++) {
			for( int j=0 ; j<n-1-i; j++) {
				
				if( arr [j] >arr[j+1]) {
					int temp=arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			System.out.println("Iteration:"+i);
			System.out.println(Arrays.toString(arr));
		}

	}
	public static void sortDescending (int[] arr) {
		//greater to less      max to min :  max < a[i];
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("Iteration:"+i);
			System.out.println(Arrays.toString(arr));
		}
		
		
		}
	
	}


