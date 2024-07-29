package com.Arraylist;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
      ArrayList l =new ArrayList();
      l.add("Virat");
      l.add(17);
      l.add(null);
      l.add("virat");
      
      System.out.println(l);
      
      l.remove(3);
      System.out.println(l);
      
      l.remove(1);
      l.add(1, 18);
      System.out.println(l);
      
      l.add(null);
      System.out.println(l);
      
	}

}
