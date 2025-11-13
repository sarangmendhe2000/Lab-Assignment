package com.demo.test;

import java.util.Arrays;

import com.demo.beans.QuicksortAlgorithm;

public class TestQuicksortAlgorithm {

	public static void main(String[] args) {
		int[] arr= {5,1,9,3,7,4,9,0};
		
		QuicksortAlgorithm.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
