package com.practise.array;

public class SelctionSort {
	public static void printArray(int arr[]){
 	   for(int i=0; i<arr.length; i++) {
 		System.out.print(arr[i]+" ");   
 	   }
	}  
	public static void main(String[] args) {
       int arr[]= {5,3,6,2,8};
       
       for(int i=0; i<arr.length-1; i++) {
    	   int small=i;
    	   
    	   for(int j=i+1; j<arr.length-1; j++) {
    		   if(arr[small]>arr[j])
    			   small=j;
    	   }
    	   int temp=arr[small];
           arr[small]=arr[i];
           arr[i]=temp;
       }
       printArray(arr);
	}

}
