package com.practise.array;

public class ReverseArray {
    static void reverse(int arr[]) {
    	int temp;
    	int start=0, end=arr.length-1;
    	
    	while(start < end) {
    		temp=arr[start];
    		arr[start]=arr[end];
    		arr[end]=temp;
    		start++;
    		end--;
    	}
    	
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
    
		int arr[]= {1,2,3,4,5,9};
		int arr1[]= {5,6,6,8,2,3};

		 reverse(arr);
		 System.out.println();
		 reverse(arr1);

	}

}
