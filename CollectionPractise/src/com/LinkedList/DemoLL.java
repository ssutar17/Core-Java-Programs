package com.LinkedList;

import java.util.LinkedList;

public class DemoLL {

	public static void main(String[] args) {
     LinkedList l=new LinkedList();
     
     l.add("A");
     l.add(10);
     l.add("Kohli");
     l.add("Kohli");
     l.add("null");
     l.addFirst("VK");
     l.addLast("7");
     
     System.out.println(l);
     System.out.println(l.getFirst());
     System.out.println(l.getLast());
     l.removeLast();
     l.removeFirst();
     System.out.println(l);
     
     l.add(2, "virat");
     l.add(4, null);
     System.out.println(l);
     }

}
