package com.demo.hashing;

public class MyHashClass {
	
	Node[] heads;
	
	class Node{
		int data;
		Node next;
		
		
		public Node (int data)
		{
			this.data = data;
			this.next= null;
		}
		
		
	}
	
	public MyHashClass()
	{
		heads = new Node[10];
		
		for(int i=0;i<heads.length;i++)
		{
			heads[i]= null;
		}
		
	}
	
	public MyHashClass(int size)
	{
		heads = new Node[size];
		
		for(int i=0;i<heads.length;i++)
		{
			heads[i]= null;
		}
	}
	
	// Insert Data in Hash Table 
	
	public void insertData(int val)
	{
		Node newnode = new Node(val);
		
		int pos = val%(heads.length);
		
		if(heads[pos] != null)
		{
			newnode.next= heads[pos];
		}
		heads[pos] = newnode;
	}
	
	
	// Display Data in Hash Table 
	
	public void display ()
	{
		for(int i=0;i<heads.length;i++)
		{
			Node temp = heads[i];
			
			while(temp != null)
			{
				System.out.print(temp.data+"---->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}
	
	// Search data in Hash Table 
	
	public boolean searchData(int val)
	{
		int pos = val%heads.length;
		Node temp = heads[pos];
		
		while(temp != null)
		{
			if(temp.data == val)
			{
				System.out.println(val + "found in bucket " + pos);
				return true;
			}
			temp= temp.next;
		}
		return false;
	}
	
	
}
