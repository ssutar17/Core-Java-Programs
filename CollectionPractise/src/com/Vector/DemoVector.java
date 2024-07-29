package com.Vector;

import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
      Vector v=new Vector();
      
      for(int i=1; i<=10; i++) {
          v.addElement(i);
       }
      System.out.println(v.capacity());
      
      v.addElement("VK");
      System.out.println(v.capacity());
      System.out.println(v);
      
      v.removeElement(5);
      System.out.println(v);
      
      System.out.println(v.size());
      System.out.println(v.elementAt(6));


	}

}
