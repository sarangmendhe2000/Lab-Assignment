package com.demo.test;

import java.util.Arrays;

import com.demo.beans.selectionSort;

public class testSort {

	public static void main(String[] args) {
		int[] arr1 = {45,12,24,20,7,8};
		
		selectionSort ob = new selectionSort();
		
		System.out.println("original array:");
		System.out.println(Arrays.toString(arr1));
		
		ob.selectionSortAscending(arr1);
		System.out.println("Array sorted in Ascending order:");
		System.out.println(Arrays.toString(arr1));
		
		ob.selectionSortDescending(arr1);
		System.out.println("Array sorted in Descending order:");
		System.out.println(Arrays.toString(arr1));
		
		
		int max =selectionSort.findNthMax(arr1);
		System.out.println("max "+ max);
	System.out.println(Arrays.toString(arr1));
	

	}

}
