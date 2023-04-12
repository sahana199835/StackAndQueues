package com.bridgelabz.stacksandqueues;

import java.util.EmptyStackException;
import java.util.Stack;

public class StacksAndQueues {
	
	static void pushData(Stack stack, int a ) {
		 stack.push(new Integer(a));
		 System.out.println("Push(" + a + ")");
		 System.out.println("Stack: " + stack);
		

	 }

	static void popData(Stack stack) {

		System.out.println("pop ->");
		Integer a = (Integer) stack.pop();
		System.out.println(a);
		System.out.println("Stack : " + stack);
	}


	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println("Stack :" + stack);

		pushData(stack, 56);
		pushData(stack, 30);
		pushData(stack, 70);

		System.out.println("Elements of the stack is " + stack);
		popData(stack);
		popData(stack);
		popData(stack);

		System.out.println("Check the stack is empty or not ? " + stack.empty());

		try {
			stack.pop();
		} catch (EmptyStackException e) {
			System.out.println("Stack is empty");
		}

		try {
			stack.peek();
		} catch (EmptyStackException e) {
			System.out.println("Stack is empty");
		}

	}
}


