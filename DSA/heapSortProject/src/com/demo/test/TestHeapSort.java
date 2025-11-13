package com.demo.test;

import java.util.Arrays;

import com.demo.beans.heapSort;
public class TestHeapSort{

		public static void main(String[] args) {
		int[] arr= {7,10,5,12,3,9,2,1};
		heapSort ob= new heapSort();
		System.out.println("original array:");
		System.out.println(Arrays.toString(arr));
		ob.heapSortAlgo(arr);
		
		heapSort.heapSortAlgo(arr);
		heapSort.heapSortDescending(arr);
		System.out.println("heap sorting in descending order:");
        System.out.println(Arrays.toString(arr));
		}

		
		
}


