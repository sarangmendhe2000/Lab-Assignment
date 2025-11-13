package com.demo.beans;

import java.util.Arrays;

public class heapSort {
	
	public static void heapifyMin(int[] arr, int n,int i){
		int smallest =i;
		int left =2*i+1;
		int right = 2*i+2;
		
		if(left<n && arr[left] <arr[smallest]) {
			smallest = left;
		}
		
		if(right<n && arr[right] <arr[smallest]) {
			smallest = right;
		}
		
		if(smallest !=i) {
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
			heapifyMin(arr,n,smallest);
		}
	}
	
	public static void heapSortDescending(int[] arr) {
		
		for(int i=(arr.length)-1;i>0;i--) {
			heapifyMin(arr,arr.length,i);
		}
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			System.out.println(Arrays.toString(arr));
			heapifyMin(arr,i,0);
		}
		
	
	}
	public static void heapify(int[] arr,int i ,int n) {
		int left = 2*i+1;
		int right = 2*i+2;
		int largest =i;
		if(left< n && arr[left]> arr[largest]) {
			largest = right;
			
		}
		if(right<n && arr[right]>arr[largest]) {
			largest = left;
			if(largest !=i) {
				int temp = arr[largest];
				arr[largest]=arr[i];
				arr[i]=temp;
				heapify(arr,n,largest);
			}
		}
	}
		
		public static void heapSortAlgo(int[] arr){
			for(int i = (arr.length)-1;i>=0;i--) {
				int temp = arr[0];
				arr[0]=arr[i];
				arr[i]=temp;
				System.out.println(Arrays.toString(arr));
				heapify(arr,i,0);
			}
	}
	
	
	}