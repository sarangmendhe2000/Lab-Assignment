package com.demo.Test;

import java.util.Scanner;

import com.demo.beans.My2DArray;

public class Test2DArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		My2DArray ob = new My2DArray();
		
		ob.acceptData();
		ob.displayData();
		
		//Rotate array 
		System.out.println("--------------------------");
		
//		ob.rotateRow(true, 1);
//		ob.displayData();
		
		System.out.println("-----------------");
		
		//Rotate Column wise
		
		ob.columnRotation(false , 1);
		ob.displayData();
		
		//Check for identity matrix
		
		boolean flag = ob.isIdentical();
		if(flag)
		{
			System.out.println("Matrix is Identical");
		}
		else
		{
			System.out.println("Matrix is not Identical");
		}
	}

}
