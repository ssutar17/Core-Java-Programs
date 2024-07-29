package com.practise.array;

public class SecLarge {
	
	static void sortArray(int arr[]) {
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
		
		for(int k=arr.length-1; k>0; k--) {
			if(arr[k-1]!=arr[k-2]) {
				System.out.println(arr[k-2]);
				break;
			}
		}
	}

	public static void main(String[] args) {
	     int arr[]= {1,2,3,4,5,6,6,6};
	     
	     sortArray(arr);

	}

}
