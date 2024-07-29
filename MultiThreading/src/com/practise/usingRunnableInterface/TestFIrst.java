package com.practise.usingRunnableInterface;

public class TestFIrst {

	public static void main(String[] args) {
		
		FIrst f=new FIrst();
		Thread t=new Thread(f);
		t.start();
		
		for(int i=1; i<6; i++)
		System.out.println("Executed by Main Thread");

	}

}
