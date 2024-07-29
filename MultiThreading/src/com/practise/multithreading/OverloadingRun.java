// Here start method will call "only no-Argument run method"
// to execute overloaded run we have to call it explicitly

package com.practise.multithreading;

public class OverloadingRun extends Thread {
	
	public void run() {
		   for(int i=1; i<3; i++)
		   System.out.println("Child Thread");
	   }
	
	public void run(int i) {
		   for(int j=1; j<3; j++)
		   System.out.println("Overloaded Run");
	   }
}
