package com.demo.test;

import java.util.Scanner;

import com.demo.service.arrayService;

public class testSearch {
	public static void main(String[] args) {
		
		int [] arr= {25,23,45,67,12};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number for searching");
		int n = sc.nextInt();
		
	int pos =arrayService.sequencialSearch(n,arr);
	
		// using for indexing if exist then found 
		if(pos !=-1) {
			System.out.println("number found:"+pos);
			
		}else {
			System.out.println("number not found");
			
		}
		int arr1[]= {12,34,45,56,67};
		System.out.println("Enter number for searching");
		int searchnum = sc.nextInt();
		
		int pos1 =arrayService.binarySearchNonRecursive(arr1,searchnum);
		if(pos1 != -1) {
			System.out.println("number found"+ pos1);
		}else {
			System.out.println("number not found");
		}
	}
	
		
	}


