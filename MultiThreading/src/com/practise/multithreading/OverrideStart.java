//Here Start will call start like normal method call
// no new Thread will be created

package com.practise.multithreading;

public class OverrideStart extends Thread {
	
	public void start() {
		for(int j=1; j<3; j++)
			   System.out.println(" Start ");
		   }
	
	public void run() {
		   for(int i=1; i<3; i++)
		   System.out.println("Child Thread");
	   }
}
