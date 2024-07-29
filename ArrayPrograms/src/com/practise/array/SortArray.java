package com.practise.array;

public class SortArray {

	public static void main(String[] args) {
      int arr[]= {3,4,6,2,7,9,32,34,12};
      int temp;
      for(int i=0; i<arr.length; i++) {
    	  for(int j=i+1; j<arr.length; j++) {
    		  if(arr[i]>arr[j]) {
    			 temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    		  }
    	  }
      }
      for(int k=0; k<arr.length; k++) {
    	  System.out.print(arr[k]+" ");
      }
	}

}






