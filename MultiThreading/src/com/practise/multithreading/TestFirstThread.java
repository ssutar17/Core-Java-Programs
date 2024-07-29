package com.practise.multithreading;

public class TestFirstThread {

	public static void main(String[] args) {
        FirstThread t=new FirstThread();
        t.start(); //Staring of child thread
        
        for(int i=1; i<3; i++) {
        	System.out.println("Main Thread");
        }
	}

}
