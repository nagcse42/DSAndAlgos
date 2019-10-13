package com.practice.ds;

public class MyLinkedListTest {
	
	public static MyLinkedList myLinkedList;
	 
	public static void main(String[] args) {
 
		// Default constructor - let's put "0" into head element.
		myLinkedList = new MyLinkedList();
 
		// add more elements to LinkedList
		myLinkedList.add("1");
		myLinkedList.add("2");
		myLinkedList.add("3");
		myLinkedList.add("4");
		myLinkedList.add("5");
 
		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */
 
		System.out.println("Print: MyList: \t\t" + myLinkedList);
		System.out.println(".size(): \t\t\t\t" + myLinkedList.size());
		System.out.println(".get(3): \t\t\t\t" + myLinkedList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + myLinkedList.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + myLinkedList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + myLinkedList.size());
		System.out.println("Print again: MyList: \t" + myLinkedList);
	}


}
