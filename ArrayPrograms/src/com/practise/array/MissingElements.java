package com.practise.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MissingElements {
	
	public static int findMax(int aa[]) {
       int max=aa[0];
		
		for(int i=1; i<aa.length; i++) {
			if(aa[i]>max) {
				max=aa[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
          int[] arr=new int[n];
          
          for(int i=0; i<arr.length; i++) {
        	  arr[i]=sc.nextInt();
          }
          
          int size=findMax(arr);
          
          List l=new ArrayList();
          
          for(int i=0; i<=size; i++) {
        	  l.add(i);
          }
          
          for(int i=0; i<arr.length; i++) {
        		  if(l.contains(arr[i])) {
        			  l.remove(Integer.valueOf(arr[i]));
        		  }
          }
          
          System.out.println(l);
	}
}
