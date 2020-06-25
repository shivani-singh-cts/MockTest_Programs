package com.mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

	ReverseLinkedList list = new ReverseLinkedList();
	
	@Test
	void test() {
	
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		assertNotNull(list.reverse(list.head));
	}

	@Test 
	void testNullCase() {
		list.head = null;
		assertNull(list.reverse(list.head));
	}
}
