package com.practise.array;

public class MinElement {

	public static void main(String[] args) {
      int arr[]= {3,5,7,7,10,9};
      
      int min=arr[0];
      for(int i=0; i< arr.length; i++) {
    	  if(min > arr[i]) {
    		  min=arr[i];
    	  }
      }
      System.out.println("Minimum No:"+ min);
	}

}
