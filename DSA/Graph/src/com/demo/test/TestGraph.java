package com.demo.test;

import java.util.Scanner;

import com.demo.graph.Graph;

public class TestGraph {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many vertices : ");
		
		int v = sc.nextInt();
		
		int [][] myGraph = new int[v][v];
		
		storeGraph(myGraph);
		
		displayMatrix(myGraph);

	}

	private static void displayMatrix(int[][] myGraph) {
		
		for(int i=0;i<myGraph.length;i++)
		{
			System.out.print(myGraph[i][i]+"\t");
		}
		System.out.println();
	}

	private static void storeGraph(int[][] myGraph) {
		
		Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<myGraph.length;i++)
		{
			for(int j=0 ; j<myGraph[0].length;j++)
			{
				System.out.println("Is there is any edge between "+i+" and "+j);
				myGraph[i][j]= sc.nextInt();
			}
		}
	}

}
