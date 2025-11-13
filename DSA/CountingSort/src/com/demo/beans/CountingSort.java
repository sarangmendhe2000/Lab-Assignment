package com.demo.beans;
import java.util.Arrays;

public class CountingSort {

	//why we used int[] because we want to return integer array
	//static tells how you can access and use the method which is accessible to same class
public static int[] coutSort(int[] arr) {
	//find max Array
	int max = findmax(arr);
	System.out.println("max:"+max);
	
	int[] count = new int[max+1];
	for(int i = 0;i< count.length;i++) {
		count[i]=0;
		
	}
	
	for(int i=0;i<arr.length;i++) {
		count[arr[i]]++;
	}
	System.out.println(Arrays.toString(count));
	//find cumulative sum
	for(int i=1; i<count.length;i++) {
		count[i]=count[i-1]+count[i];

	}
	 System.out.println(Arrays.toString(count));
	 int[] output=new int[arr.length];
		
	for(int i=0; i<arr.length; i++) {
		int pos = count[arr[i]]-1;
		output[pos]=arr[i];
		count [arr[i]]--;
		
	}
	System.out.println(Arrays.toString(arr));
	return output;
	
}
//method for finding max
private static int findmax(int[] arr) {
	int max = arr[0];
	for(int i=0; i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
		
	}
	return max;
}
	}


