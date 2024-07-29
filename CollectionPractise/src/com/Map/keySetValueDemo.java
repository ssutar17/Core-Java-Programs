package com.Map;

import java.util.HashMap;

public class keySetValueDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Thor");
		hm.put(2, "Hulk");
		hm.put(3, "Ironman");
		hm.put(3, "Stark");
		
		for(Integer key : hm.keySet()) {
			System.out.println("key:"+key );
		}
		
		for(String value : hm.values()) {
			System.out.println("Value:"+value );
		}

	}

}
