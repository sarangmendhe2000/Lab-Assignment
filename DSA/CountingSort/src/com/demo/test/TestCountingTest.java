package com.demo.test;

import java.util.Arrays;

import com.demo.beans.CountingSort;

public class TestCountingTest {

	public static void main(String[] args) {
	
		int arr[]= {5,2,9,2,11};
		int[] result= CountingSort.coutSort(arr);
		System.out.println("result:"+ Arrays.toString(result));
		
	}

}
