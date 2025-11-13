package com.demo.beans;

public class MyHashTable {
    Node[] head;
    class Node{
    	int data;
    	Node next ;
    	public Node(int val){
    		this.data= val;
    		this.next = null ;
    	}
    }
    //default constructor
    public MyHashTable() {
    	head = new Node[5];
    	
    }
    // parameterize constructor
    public MyHashTable(int size){
    	head = new Node[size];
    	
    }
    // insert data method 
    public void insertData(int num) {
    	Node newNode= new Node(num);
    	int pos= num%head.length;
    	if(head[pos]==null) {
    		head[pos]=newNode;
  	
    	}else {
    		newNode.next = head[pos];
    		head[pos]= newNode;
    		
    	}
    }
    //method for searchData 
    public boolean SearchData(int num){
    	int pos = num%head.length;
    	if(head[pos]==null) {
    		System.out.println("bucket is empty, number not found");
    		
    	}else {
    		Node temp = head[pos];
    		while(temp!=null) {
    			if(temp.data==num) {
    				System.out.println("number found"+num+"in bucket"+pos);
    				return true;
    				
    			}
    			temp= temp.next;	
    		}
    		System.out.println("data not found"+num+"in bucket"+pos);
    		
    	}
		return false; 	
    }
    
    //method to display data
    
    public void displayData() {
  	    for(int i=0;i<head.length;i++) {
  		   Node temp=head[i];
  		   System.out.print(i+"---->");
  		 while(temp!=null) {
  			  System.out.print(temp.data+"---->");
  			  temp=temp.next;
  		    }
  		  System.out.print("null\n");
          }
    }
}












