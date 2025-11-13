package com.demo.test;

import java.util.Arrays;

import com.demo.beans.bubbleSort;

public class TestbubbleSort {

	public static void main(String[] args) {
		 int []arr = {24,10,20,40,55,10,30};
		 
		 bubbleSort bSort =new bubbleSort();
		 System.out.println("***********************************");
		 System.out.println("orignal array:");
		 System.out.println(Arrays.toString(arr));
		 System.out.println("************************************");
		 
		 bSort.sortAscending(arr);
		 System.out.println("*************************************");
		 System.out.println("sorted in ascending order:");
		 System.out.println(Arrays.toString(arr));
		 System.out.println("*************************************");
		 
		 bSort.sortDescending(arr);
		 System.out.println("************************************");
		 System.out.println("sorted in descending order:");
		 System.out.println(Arrays.toString(arr));
		 System.out.println("*************************************");
}
	
}
