package com.mock.test;

import java.util.LinkedList;

class Producer implements Runnable {
	private LinkedList<Integer> queue = new LinkedList<>();
	private int size;
	
	Producer(LinkedList<Integer> queue, int size) {
		this.queue = queue;
		this.size = size;
	}
	@Override
	public void run() {
		for(int i = 0; i < 15; i++) {
			System.out.println("Producing: "+ i);
			try {
				produce(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	void produce(int i) throws InterruptedException {
		while(queue.size() == size) {
			synchronized(queue) {
				System.out.println("Queue is full. Waiting for Consumer to consume...");
				queue.wait();
			}
		}
		synchronized(queue) {
			queue.add(i);
			queue.notifyAll();
		}
	}
}

class Consumer implements Runnable {
	private LinkedList<Integer> queue = new LinkedList<>();
	private int size;
	
	Consumer(LinkedList<Integer> queue, int size) {
		this.queue = queue;
		this.size = size;
	}
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Consuming: " + consume());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	int consume() throws InterruptedException {
		while(queue.isEmpty()) {
			synchronized(queue) {
				System.out.println("Queue is empty. Waiting for Producer to produce...");
				queue.wait();
			}
		}
		synchronized(queue) {
			queue.notifyAll();
			return queue.remove(0);
		}
	}
}
public class ProducerConsumerProblem {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();
		int size = 10;
		Thread producer = new Thread(new Producer(queue, size));
		Thread consumer = new Thread(new Consumer(queue, size));
		
		producer.start();
		consumer.start();
	}
}
