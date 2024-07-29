package com.practise.array;

public class MaxElement {
	static int find(int aa[]) {
		int max=aa[0];
		
		for(int i=1; i<aa.length; i++) {
			if(aa[i]>max) {
				max=aa[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {4,6,3,2,5,5, 8};
		 
		int maxx=find(arr);
		System.out.println("Maximum Element:"+ maxx);
	}

}
