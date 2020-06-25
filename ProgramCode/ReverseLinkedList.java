package com.mock.test;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
	}
}
public class ReverseLinkedList {

	Node head;
	
	Node reverse(Node n) {
		Node prev = null;
		Node next = null;
		Node curr = n;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		n = prev;
		return n;
	}
	
	void printLinkedList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
	}
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		
		System.out.println("Linked list is: ");
		list.printLinkedList();
		
		System.out.println("\nReversed Linked List is: ");
		list.head = list.reverse(list.head);
		list.printLinkedList();

	}

}
