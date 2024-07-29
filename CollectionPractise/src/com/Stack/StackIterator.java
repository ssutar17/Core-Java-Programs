package com.Stack;

import java.util.*;

public class StackIterator {

	public static void main(String args[]) {
		// Creating an empty Stack
		Stack<String> stack = new Stack<String>();

		// Use add() method to add elements into the Stack
		stack.add("Welcome");
		stack.add("To");
		stack.add("Geeks");
		stack.add("4");
		stack.add("Geeks");

		// Displaying the Stack
		System.out.println("Stack: " + stack);

		// Creating an iterator
		Iterator value = stack.iterator();

		// Displaying the values
		// after iterating through the stack
		System.out.println("The iterator values are: ");
		while (value.hasNext()) {
			System.out.println(value.next());
		}
	}
}
