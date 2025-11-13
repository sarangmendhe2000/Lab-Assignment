package com.demo.test;
import com.demo.beans.SinglyLinkedList;
public class TestSinglyLinkedList {
	
	public static void main (String [] args) {
		SinglyLinkedList mlist = new SinglyLinkedList();
	
		mlist.addNode(100);
		mlist.addNode(200);
		mlist.addNode(300);
		mlist.addNode(400);
		mlist.addNode(500);
		mlist.addNode(700);
		mlist.displayData();
		mlist.addByPosition(500, 5);
		mlist.addByPosition(200, 2);
	    mlist.addByPosition(300, 6);
		mlist.addByPosition(300, 7);
		mlist.addByPosition(1000, 1);
		mlist.addByValue(900, 4);
		//mlist.addByValue(200, 12);
		//mlist.addByValue(300,8);
		//mlist.addByValue(400, 20);
		//mlist.deleteByPosition(5);
		//mlist.deleteByPosition(3);
		//mlist.deleteByPosition(1);
		//mlist.deleteByPosition(5);
		mlist.deleteByValue(500);
		mlist.deleteByValue(400);
		
		mlist.displayData();

}
}
