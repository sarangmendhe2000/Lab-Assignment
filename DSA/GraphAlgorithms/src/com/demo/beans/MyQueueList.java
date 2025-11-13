package com.demo.beans;

public class MyQueueList {
	Node front,rear;
	
	class Node{
		int data;
		Node next;
		
		public Node(int value) {
			this.data=value;
			this.next=null;
		}
		public void MyQueueList() {
			front = null;
			rear = null;
			
		}
		public boolean isEmpty() {
			if(front == null) {
			System.out.println("Queue is empty");
		
		return true;
		}
		return false;
	}
		public void enqueue(int v){
			Node newNode = new Node(v);
			if(isEmpty()) {
				rear = newNode;
				front = newNode;
			}else {
				rear.next = newNode;
				rear = newNode;
			}
			System.out.println("added succesfully");
			
		}
		
		public void dequeue(int v) {
			if(isEmpty());
		}
		
	}

	public void enqueue(int n) {
	if(isEmpty());
	
		
	}

	boolean isEmpty() {
	
		return false;
	}

	public int dequeue() {
		return 0;
	}

}

