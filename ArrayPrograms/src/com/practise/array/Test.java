package com.practise.array;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String, String> h= new HashMap<String, String>();
      h.put("name", "Sunny");
      h.put("name", "abc");
      String s= h.get("name");
      System.out.println(s);
	}

}
