package com.demo.test;

import com.demo.beans.MytwoArrayLinkedList;
import com.demo.beans.MytwoArrayLinkedList.MyTwoArrayList;
public class MyTest2Array {
	public static void main(String[] args) {
		  MyTwoArrayList<Integer> list = new MytwoArrayLinkedList<>(5);
	        list.addLast(10);
	        list.addLast(20);
	        list.addFirst(5);
	        list.addLast(30);
	        System.out.println(list); // Output: [5, 10, 20, 30]
	        System.out.println("Size: " + list.size()); // Output: Size: 4

	        System.out.println("Get at index 1: " + list.get(1)); // Output: Get at index 1: 10

	        list.insertAt(2, 15);
	        System.out.println(list); // Output: [5, 10, 15, 20, 30]

	        System.out.println("Removed first: " + list.removeFirst()); // Output: Removed first: 5
	        System.out.println(list); // Output: [10, 15, 20, 30]

	        System.out.println("Removed last: " + list.removeLast()); // Output
}
	}


