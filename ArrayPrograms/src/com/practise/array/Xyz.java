package com.practise.array;

public class Xyz {

	public static void main(String[] args) {
		String s="hello";

		char [] s1=s.toCharArray();
		 
		for(int i=0; i<s.length(); i++) {
			
			if(s1[i]=='a' || s1[i]=='e' ||s1[i]=='i' ||s1[i]=='o' ||s1[i]=='u' ||s1[i]=='A' || s1[i]=='E' ||s1[i]=='I' ||s1[i]=='O' ||s1[i]=='U') {			System.out.println(s1[i]);
}
			
		}
		
	}

}
