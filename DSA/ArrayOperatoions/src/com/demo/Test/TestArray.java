package com.demo.Test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import com.demo.beans.MyArray;

public class TestArray {

	public static void main(String[] args) {
		
		MyArray arr = new MyArray();
		
//		System.out.println("Enter array size");
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
		
//		 arr = new MyArray(size);
		
		System.out.println("Capacity - " + arr.getCapacity());
		
		arr.add(5);
		arr.add(7);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(8);
		
		System.out.println(arr);
		
//		arr.addAtPos(3, 22);
//		System.out.println(arr);
		
//		arr.deleteByPos(2);
//		System.out.println(arr);
//		
//		arr.searchByValue(25);
//		
//		arr.deleteByValue(20);
//		System.out.println(arr);
//		
//		arr.rotateArray(true, 1);
//		System.out.println(arr);
		
		int [] arr1 = arr.exchangeIndexValue();
		System.out.println(Arrays.toString(arr1));
//		IntStream.of(arr1).forEach(e->System.out.print(e+","));
		
	}

}
