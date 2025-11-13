package com.demo.bean;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rotateRight{
      private int[] arr;
      private int count;

	public rotateRight() {
		super();
		arr=new int[10];
		count=0;
	}
	
	public  rotateRight(int size) {
		super();
		arr=new int[size];
	}
	
	public  rotateRight(int[] arr) {
		super();
		this.arr = arr;
		count=arr.length;
	}
	
	public void add(int x) {
		if(count<arr.length) {
			arr[count]=x;
			count++;
		}
		
	}
	public void rotateArray(int n) {
	
		if(n>=arr.length) {
			System.out.println("rotation is not possible, n should be < "+arr.length);
		}else {
			
			for(int count=1;count<=n;count++) {
				int temp=arr[0];
				for(int i=1;i<arr.length;i++) {
					arr[i-1]=arr[i];
				}
			
				arr[arr.length-1]=temp;
				System.out.println("rotation---> "+count);
				System.out.println(Arrays.toString(arr));
			}
			
		}


}
	public int[] reverseArray(boolean flag) {
		if(flag) {
			for(int i=0,j=arr.length-1;i<j;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			return arr;
		}else {
			
			int[] arr1=new int[arr.length];
			for(int i=arr.length-1,j=0;i>=0;i--,j++) {
				arr1[j]=arr[i];
				
			}
			return arr1;
		}
	}

	@Override
	public String toString() {
		return "rotateRight [arr=" + Arrays.toString(arr) + "]";
	}

	public int getLength() {
		return arr.length;
	}
	
	

		
	}
