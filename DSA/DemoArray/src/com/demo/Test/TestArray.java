package com.demo.Test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.beans.MyArray;

public class TestArray {

	

	public static void main(String[] args) {
	   MyArray ab= new MyArray(5);
	   Scanner sc=new Scanner (System.in);
	   for(int i=0; i<ab.getlength(); i++ ) {
		  System.out.println("enter the number");
		  int n=sc.nextInt();
		  ab.add(n);
	   }
System.out.println(ab);
//find the sum of all elements in array
System.out.println("sum :"+ab.getsum());

//ab.rotateArray(4);
//System.out.println("After 4 location");
//System.out.println(ab);

//System.out.println (Arrays.toString(ab.reverseArray(false)));

//System.out.println(Arrays.toString(ab.replaceIndexValue()));
	}
	
	
	
	
	

}
