package com.mock.test;

class Node1 {
	int data;
	Node1 next;
	Node1(int data) {
		this.data = data;
		next = null;
	}
}
public class NumberAdditionLinkedList {

	Node1 head1, head2;
	
	Node1 addNumbersInList(Node1 first, Node1 second) {
		
		Node1 tempHead = new Node1(0);
		Node1 result = tempHead;
		int carry = 0;
		int sum;
		
		while(first != null || second != null) {
			int x = (first != null)? first.data : 0; 
			int y = (second != null)? second.data : 0;
			sum = x + y + carry;
			carry = sum/10;
			sum = sum % 10;
			result.next = new Node1(sum);
			result = result.next;
	
			if(first != null)
				first = first.next;
			if(second != null)
				second = second.next;
		}
		if(carry > 0)
			result.next = new Node1(carry);
		result = tempHead.next;
		return result;
	}
	
	void printList(Node1 n) {
		while(n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NumberAdditionLinkedList list = new NumberAdditionLinkedList();
		//First List
		list.head1 = new Node1(2);
		list.head1.next = new Node1(4);
		list.head1.next.next = new Node1(3);
		System.out.println("First List: ");
		list.printList(list.head1);
		
		//Second list
		list.head2 = new Node1(5);
		list.head2.next = new Node1(6);
		list.head2.next.next = new Node1(4);
		System.out.println("Second List: ");
		list.printList(list.head2);
		
		Node1 sum = list.addNumbersInList(list.head1, list.head2);
		System.out.println("List after addition is: ");
		list.printList(sum);
	}

}
