package com.bridgelabz.stacksandqueues;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueues {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(56);
		queue.add(30);
		queue.add(70);

		System.out.println("The Queue elements are : " + queue);
		System.out.println("The Peek element is :" + queue.peek());


		int number1 = queue.remove();
		System.out.println("After Removing the Element : " + number1);

		int number2 = queue.remove();
		System.out.println("After Removing the Element : " + number2);
		System.out.println("The Queue elements are : " + queue);
	}

}
 