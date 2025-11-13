package com.demo.graph;

public class MyLinkedList {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data= data;
			this.next = null;
		}
		
		
	}
	
	public MyLinkedList()
	{
		head = null;
	}
	
	// add data
	
	public void addData(int val)
	{
		Node newnode = new Node(val);
		
		if(head != null)
		{
			newnode.next= null;
		}
		head = newnode;
	}
	
	// search Data
	public boolean searchData(int val)
	{
		if(head==null)
		{
			return false; 
		}
		
		else
		{
			Node temp = head;
			
			while(temp != null && temp.data != val)
			{
				temp = temp.next;
			}
			
			if(temp.data == val)
			{
				return true;
			}
			
			return false;
		}
	}
	
	// getAdjacent Nodes
	
	
	public int[] getAdjescentNodes(int [] arr)
	{
		Node temp = head ;
		
		for(int i=0 ; temp!= null && i<arr.length;i++)
		{
			arr[i]=temp.data;
			temp = temp.next;
		}
		
		return arr;
	}
	
	
	// display
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("Empty");
		}
		
		else
		{
			Node temp = head;
			
			while(temp != null)
			{
				System.out.println(temp.data+" -->");
				temp=temp.next;
			}
		}
	}
}
