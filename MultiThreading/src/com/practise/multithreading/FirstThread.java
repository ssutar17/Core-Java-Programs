// First thread program
//In this program two threads are created one is main and other is child

package com.practise.multithreading;

public class FirstThread extends Thread{
   public void run() {
	   for(int i=1; i<3; i++)
	   System.out.println("Child Thread");
   }
}
