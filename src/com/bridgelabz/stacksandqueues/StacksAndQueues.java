package com.bridgelabz.stacksandqueues;

import java.util.Stack;

public class StacksAndQueues {
	
	static void pushData(Stack stack, int a ) {
		 stack.push(new Integer(a));
		 System.out.println("Push(" + a + ")");

	 }

	 public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("Stack :" + stack);

		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println("Elements stored in stack : " + stack);
		System.out.println("Top element of stack is : " + stack.peek());
	}
}



