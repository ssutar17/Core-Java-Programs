package com.practise.array;

public class SecLastElement {
	
	static void sortArray(int arr[]) {
		int temp;
		
		for(int i=0; i<(arr.length); i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		System.out.println("Second Last:"+arr[arr.length-2]);
	}

	public static void main(String[] args) {
		int arr[]= {9,8,7,6,5,4,3};
		
		sortArray(arr);

	}

}
