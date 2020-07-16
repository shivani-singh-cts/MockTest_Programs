package com.mock.test;

class Node3{
	int data;
	Node3 next;
	Node3(int data){
		this.data = data;
		this.next = null;
	}
}
public class SortLinkedList {

	Node3 head;
	Node3 getSplittingPoint(Node3 h) {
		Node3 n1 = h, n2 = h;
		while(n1 != null && n2 != null) {
			if(n2.next == null || n2.next.next == null)
				return n1;
			n1 = n1.next;
			n2 = n2.next.next;
		}
		return h;
	}
	Node3 sortList(Node3 head) {
		if(head == null || head.next == null)
			return head;
		
		Node3 n1 = head;
		Node3 end1 = getSplittingPoint(head);
		Node3 n2 = end1.next;
		end1.next = null;
		
		n1 = sortList(n1);
		n2 = sortList(n2);
		
		return merge(n1, n2);
	}
	Node3 merge(Node3 n1, Node3 n2) {
		Node3 head = new Node3(0);
		Node3 curr = head;
		
		while(n1 != null && n2 != null) {
			if(n1.data < n2.data) {
				curr.next = n1;
				n1 = n1.next;
			}
			else {
				curr.next = n2;
				n2 = n2.next;
			}
			curr = curr.next;
		}
		if(n1 != null) {
			curr.next = n1;
		}
		if(n2 != null) {
			curr.next = n2;
		}
		return head.next;
	}
	
	void displayList(Node3 n) {
		while(n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		} 
	}
	public static void main(String[] args) {
		SortLinkedList list = new SortLinkedList();
		list.head = new Node3(4);
		list.head.next = new Node3(1);
		list.head.next.next = new Node3(2);
		list.head.next.next.next = new Node3(3);
		
		list.head = list.sortList(list.head);
		list.displayList(list.head);
	}

}
