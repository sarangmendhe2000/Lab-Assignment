package com.demo.test;

import java.util.Arrays;

import com.demo.service.CountingSort;
import com.demo.service.HeapSort;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11,16,8,112,41,68,79};
		
//		SortingService.bubbleSort(arr);
//		System.out.println(Arrays.toString(arr));
		
		
//        SortingService.modifiedBubbleSort(arr);
//        
//        System.out.println("Final Sorted Array - ");
//		System.out.println(Arrays.toString(arr));
		
		
//        BubbleSort.modifiedBubbleSortDesc(arr);
//        
//        System.out.println("Final Sorted Array in Descending order - ");
//		System.out.println(Arrays.toString(arr));
		
		
//		QuickSort.quickSortAsc(arr, 0, arr.length-1);
//		
//		System.out.println("Final Sorted Array in Ascending order with Quick Sort - ");
//		System.out.println(Arrays.toString(arr));
//		
		
//		InsertionSort.insertionSortAsc(arr);
//		System.out.println("Final Sorted Array in Ascending order with Insertion Sort - ");
//		System.out.println(Arrays.toString(arr));
		
//		SelectionSort.selectionSortAsc(arr);
//		System.out.println("Final Sorted Array in Ascending order with Selection Sort - ");
//		System.out.println(Arrays.toString(arr));
		
//		MergeSort.mergeSortAsc(arr , 0, arr.length-1);
//		System.out.println("Final Sorted Array in Ascending order with Merge Sort - ");
//		System.out.println(Arrays.toString(arr));
		
		
		
		int [] sorted = CountingSort.countingSortAsc(arr);
		System.out.println("Final Sorted Array in Ascending order with Counting sort");
		System.out.println(Arrays.toString(sorted));
		
//		HeapSort.heapSortAsc(arr);
//		System.out.println("Final Sorted Array in ascending order with Heap Sort");
//		System.out.println(Arrays.toString(arr));
		
	}

}
