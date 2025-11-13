package com.demo.beans;

public class MyStackListGeneric<T> {
	Node top;
	//inner class
	class Node{
		T data;
		Node next;
		//Parameterized constructor 
		public Node(T value) {
			this.data=value;
		}
	}
	//default constructor 
	public MyStackListGeneric() {
		top = null;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public void push(T value) {
		Node newNode = new Node(value);
		if(!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("paushed"+value);
		
	}
	public void DisplayData() {
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.data+",");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public T pop() {
		Node temp = top;
		top=temp.next;
		temp.next = null;
		return temp.data;
		
	}
	
   }
