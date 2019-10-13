package com.practice.ds;

public class MyLinkedList {

	private static int counter;
	private Node head;

	public MyLinkedList() {

	}

	/**
	 * It adds elements to the linked list
	 * 
	 * @param data
	 */
	public void add(Object data) {

		// Check for head node if its not there create
		if (head == null) {
			head = new Node(data);
		}

		Node tempNode = new Node(data);
		Node currentMode = head;

		if (currentMode != null) {
			// starting at the head node, and iterate till we get next node as null
			while (currentMode.getNext() != null) {
				currentMode = currentMode.getNext();
			}
			// the last node's "next" reference set to our new node
			currentMode.setNext(tempNode);
		}

		// increment the number of elements variable
		incrementCounter();
	}

	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node tempNode = new Node(data);
		Node currentNode = head;

		// Let's check Null iterate over currentNode
		if (currentNode != null) {
			// crawl to the requested index or the last element in the list, whichever comes
			// first
			for (int i = 0; i < index && currentNode.getNext() != null; i++) {
				currentNode = currentNode.getNext();
			}
		}

		// set the new node's next-node reference to this node's next-node reference
		tempNode.setNext(currentNode.getNext());

		// now set this node's next-node reference to the new node
		currentNode.setNext(tempNode);

		// increment the number of elements variable
		incrementCounter();
	}

	/**
	 * returns the element at the specified position in the list.
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node currentNode = null;
		if (head != null) {
			currentNode = head.getNext();
			for (int i = 0; i < index; i++) {
				if (currentNode.getNext() == null)
					return null;

				currentNode = currentNode.getNext();
			}
			return currentNode.getData();
		}
		return currentNode;

	}

	/**
	 * removes the element at the specified position in the list.
	 * 
	 * @param index
	 * @return
	 */
	public boolean remove(int index) {

		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Node currentNode = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (currentNode.getNext() == null)
					return false;

				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());

			// decrement the number of elements variable
			decrementCounter();
			return true;

		}
		return false;
	}

	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node crunchifyCurrent = head.getNext();
			while (crunchifyCurrent != null) {
				output += "[" + crunchifyCurrent.getData().toString() + "]";
				crunchifyCurrent = crunchifyCurrent.getNext();
			}

		}
		return output;
	}

	private static int getCounter() {
		return counter;
	}

	private static void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	// Node inner class
	private class Node {
		// reference to the next node in the chain, or null if there isn't one.
		Node next;

		// data carried by this node. could be of any type you need.
		Object data;

		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}

		// another Node constructor if we want to specify the node to point to.
		@SuppressWarnings("unused")
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}

		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}

		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue;
		}

	}
}
