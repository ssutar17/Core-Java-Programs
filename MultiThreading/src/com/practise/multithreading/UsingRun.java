// here we calling run() method directly instead of start()
 
package com.practise.multithreading;

public class UsingRun extends Thread {
	public void run() {
		   for(int i=1; i<3; i++)
		   System.out.println("Child Thread");
	   }
}
