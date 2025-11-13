  package com.demo.test;

import java.util.Arrays;

import com.demo.beans.MergeSort;

public class TestMergeSort {
	
	public static void main(String[] args) {
		
		int [] arr= {4,2,10,30};
		
		System.out.println("orginal array:");
		System.out.println(Arrays.toString(arr));
		MergeSort.mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}