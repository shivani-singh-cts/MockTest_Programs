package com.mock.test;

import java.util.LinkedList;
import java.util.List;

class Node2 {
	int data;
	Node2 next;
	Node2(int data) {
		this.data= data;
		this.next = null;
	}
}
public class ChildrenChairProblem {
	
	static Node2 head;
	static int findWinner(int n, int k) {
		int result = 0;
		for(int i = 2; i <= n; i++) {
			result = (result + k)%i;
		}
		return result+1;
	}
	
	static int findWinnerCircularQ(int n, int k) {
		head = new Node2(1);
		Node2 prev = head;
		//Creating circular queue
		for(int i = 2; i<= n; i++) {
			prev.next = new Node2(i);
			prev = prev.next;
		}
		prev.next = head;
		System.out.println("Kids in Queue: ");
		printQueue();
		
		Node2 n1 = head;
		Node2 n2 = head;
		
		while(n1.next != n1) {
			int count = 1;
			while(count != k) {
				n2 = n1;
				n1 = n1.next;
				count++;
			}
			
			//remove kth kid
			System.out.println("Removing kid: "+ n1.data);
			n2.next = n1.next;
			n1 = n2.next;
			
		}
		return n1.data;
	}
	static void printQueue() {
		Node2 n = head;
		if(head != null) {
			do{
				System.out.print(n.data + " -> ");
				n = n.next;
			}while(n != head);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int n = 5;
		int k = 2;
		System.out.println("Winner Child is at position: " + findWinner(n, k));
		System.out.println("Winner child found using circular Q: " + findWinnerCircularQ(n,k));
	}

}

