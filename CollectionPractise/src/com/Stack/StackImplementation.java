package com.Stack;

import java.util.*;

public class StackImplementation {

	public static void main(String[] args)   
	{  
	//creating an instance of Stack class  
	Stack<Integer> stk= new Stack<>();  
	// pushing elements into stack  
	stk.push(78);  
	stk.push(113);  
	stk.push(90);  
	stk.push(120);
	stk.pop();
	//prints elements of the stack  
	System.out.println("Elements in Stack: " + stk);    
	}  
}
