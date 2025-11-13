package com.demo.test;

import java.util.Arrays;

import com.demo.beans.insertionSort;

public class insertionSortTest {

	public static void main(String[] args) {
		int[] arr= {3,2,5,1,7,8,5,9};
		insertionSort.insertionSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		
		}
	}


