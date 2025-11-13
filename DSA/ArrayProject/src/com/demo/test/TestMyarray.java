package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.beans.MyArray;

public class TestMyarray {

	public static void main(String[] args) {
		MyArray ob=new MyArray(5);
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ob.getLength();i++) {
			System.out.println("enter number");
			int n=sc.nextInt();
			ob.add(n);
		}
		System.out.println(ob);
	
		System.out.println("after 3 rotations");
		System.out.println(ob);
		
		System.out.println("enter number of position to rotate value ");
		int rightPos= sc.nextInt();
		ob.rotateRight(rightPos);
	}

}
