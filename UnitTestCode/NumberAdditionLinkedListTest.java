package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberAdditionLinkedListTest {

	NumberAdditionLinkedList list = new NumberAdditionLinkedList();
	@Test
	void test() {
		//5 -> 6 -> 3
		list.head1 = new Node1(5);
		list.head1.next = new Node1(6);
		list.head1.next.next = new Node1(3);
		//8 -> 4 -> 2
		list.head2 = new Node1(8);
		list.head2.next = new Node1(4);
		list.head2.next.next = new Node1(2);
		
		Node1 sum = list.addNumbersInList(list.head1, list.head2);
		Node1 expected = new Node1(3);
		assertEquals(expected.data, sum.data);
	}

	@Test
	void testDifferentNumOfDigits() {
		//7 -> 5 -> 9 -> 4 -> 6
		list.head1 = new Node1(7);
		list.head1.next = new Node1(5);
		list.head1.next.next = new Node1(9);
		list.head1.next.next.next = new Node1(4);
		list.head1.next.next.next.next = new Node1(6);
		//8 -> 4
		list.head2 = new Node1(8);
		list.head2.next = new Node1(4);
		//64957 + 48 = 65005
		Node1 sum = list.addNumbersInList(list.head1, list.head2);
		Node1 expected = new Node1(5);
		assertEquals(expected.data, sum.data);
	}
	
	@Test
	void testOneListIsNull() {
		//2 -> 4 -> 3
		list.head1 = new Node1(2);
		list.head1.next = new Node1(4);
		list.head1.next.next = new Node1(3);
		
		list.head2 = null;
		Node1 sum = list.addNumbersInList(list.head1, list.head2);
		Node1 expected = new Node1(2);
		assertEquals(expected.data, sum.data);
	}
}
