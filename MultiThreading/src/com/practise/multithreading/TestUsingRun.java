// Here we using run() instead of Start() 
// Because of this no new thread will be created

package com.practise.multithreading;

public class TestUsingRun {

	public static void main(String[] args) {
        UsingRun t= new UsingRun();
        
        t.run(); // call like normal method call
        
        for(int i=1; i<3; i++)
 		   System.out.println("Main Thread");
	}

}
