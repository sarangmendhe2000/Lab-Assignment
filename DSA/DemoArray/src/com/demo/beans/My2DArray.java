package com.demo.beans;

import java.util.Scanner;

public class My2DArray {
	
	private int [][] arr ;
	
	public My2DArray()
	{
		arr= new int[3][3];
		
	}
	
	public My2DArray(int rows , int columns)
	{
		arr= new int[rows][columns];
	}
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.println("Enter data "+ i + "," + j);
				arr[i][j]= sc.nextInt();
				
			}
		}
	}
	
	public void displayData()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	//If flag = true rotate up and vice versa
	
	public int[][] rotateRow(boolean flag ,int val)
	{
		if(flag)
		{
			for(int i =0 ;i<val;i++)
			{
				int temp[] = new int[arr.length];
				temp= arr[0];
				
				for(int j=1;j<arr.length;j++)
				{
					arr[j-1]=arr[j];
				}
				
				arr[arr.length-1]=temp;
				
			}
			return arr;
		}
		else
		{
			for(int i=0 ; i<val;i++)
			{
				int temp[] = new int[arr.length];
				temp=arr[arr.length-1];
				
				for(int j=arr.length-1;j>0;j--)
				{
					arr[j]=arr[j-1];
				}
				
				
				arr[0]= temp;
				
			}
			return arr;
		}
	}
	
	// Rotate column wise , rotate right if flag=true and rotate left if flag = false
	
	public int[][] columnRotation(boolean flag , int val)
	{
		if(flag)
		{
			for(int k=0;k<val;k++)
			{
				int temp [] = new int[arr[0].length];
				
				for(int i=0;i<arr.length;i++)
				{
					temp[i]= arr[i][arr[0].length-1];
				}
				
				for(int i=0;i<arr.length;i++)
				{
					for(int j=arr[0].length-2;j>=0;j--)
					{
						arr[i][j+1]= arr[i][j];
					}
				}
				
				for(int i=0;i<arr.length;i++)
				{
					arr[i][0]=temp[i];
				}
			}
			return arr;
		}
		else
		{
			for(int k=0;k<val;k++)
			{
				int temp[]= new int[arr[0].length];
				for(int i=0;i<arr.length;i++)
				{
					temp[i]= arr[i][0];
				}
				
				for(int i=0;i<arr.length;i++)
				{
					for(int j=1;j<arr[0].length;j++)
					{
						arr[i][j-1]= arr[i][j];
					}
				}
				for(int i=0;i<arr.length;i++)
				{
					arr[i][arr.length-1]= temp[i];
				}
			}
			return arr;
		}
	}
	
	
	public boolean isIdentical()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j && arr[i][j]!=1)
				{
					return false;
				}
				else if(i!= j && arr[i][j] !=0)
				{
					return false;
				}
				
			}
		}
		return true;
	}
	
	
}
