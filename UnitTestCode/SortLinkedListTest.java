package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortLinkedListTest {

	SortLinkedList list = new SortLinkedList();
	
	@Test
	void test() {
		Node3 expected = new Node3(3);
		
		list.head = new Node3(8);
		list.head.next = new Node3(10);
		list.head.next.next = new Node3(6);
		list.head.next.next.next = new Node3(3);
		
		assertEquals(expected.data, list.sortList(list.head).data);
	}

	@Test
	void testSingleNodeInput() {
		Node3 expected = new Node3(5);
		list.head = new Node3(5);
		
		assertEquals(expected.data, list.sortList(list.head).data);
	}
}
