package com.demo.service;

    public class arrayService {
	  public static int sequencialSearch(int n, int[] arr) {
		for(int i =0;i<arr.length;i++) {
			if ( arr[i] == n) {
				return i;
		}
		
		}
		return -1;
		}

	public static int binarySearchNonRecursive(int[] arr1, int searchnum) {
		int low = 0;
		int high= arr1.length-1;
		
		while(  low<=high) {
		   int mid = (int)(low+high)/2;
		   
		   if ( arr1[mid]== searchnum) {
			   return mid;
			   
		   }else if(arr1[mid]<searchnum) {
				low=mid+1;
				
			}else {
				high=mid-1;
			}		
		   
		} return -1;
	
	}
}