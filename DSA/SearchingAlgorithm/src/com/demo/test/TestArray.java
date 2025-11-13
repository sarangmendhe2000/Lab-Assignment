package com.demo.test;

import com.demo.search.SearchingService;

public class TestArray {

	public static void main(String[] args) {
		
		int arr [] = {2,8,25,94,102,802,1000,1002,1003,9000,11000,12000};
		
//		int pos = SearchingService.binarySearch(arr,8);
		
		int pos = SearchingService.binarySearchRecursive(arr, 11000, 0, arr.length-1);
		
		if(pos != -1)
		{
			System.out.println("Value dound at Index - "+ pos);
		}
		else
		{
			System.out.println("Data not found");
		}

	}

}
