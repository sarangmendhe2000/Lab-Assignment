package com.demo.graph;

public class Graph {
	
	MyLinkedList[] graph;
	
	public Graph(int v)
	{
		this.graph= new MyLinkedList[v];
		
		
		for(int i=0;i<this.graph.length;i++)
		{
			graph[i]= new MyLinkedList();
		}
	}
	
	public void addEdge(int source , int dest)
	{
		graph[source].addData(dest);
	}
	
	public void printGraph()
	{
		for(int i=0; i<graph.length;i++)
		{
			System.out.println(i + "-->");
			graph[i].display();
		}
	}

}
