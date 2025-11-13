package cpm.demo.beans;

public class MyStackListGeneric<T>{
	Node Top;
	class Node{
		T data;
		Node next;
		public Node(T value) {
			this.data=value;
		}
	}
	public  MyStackListGeneric() {
		Top = null;	
	}
	
	public boolean isEmpty(){
		return Top == null;
	}
	
	public void push(T value) {
		Node newNode = new Node(value);
		if (!isEmpty()) {
		newNode.next = Top;
		
		}
		   Top = newNode;
		 System.out.println(value+"push :");
	}
	
	public void DisplayData(){
		Node temp = Top;
		while(temp != null) {
			System.out.println( temp.data);
			temp = temp.next;
		}
	}
	public T pop() {
		if(!isEmpty()) {
			Node temp = Top;
			Top = temp.next;
			temp.next = null;
			return temp.data;
		}
		System.out.println("stack is empty !");
		return null;
		
	}

}
