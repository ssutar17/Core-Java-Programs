package com.practise.array;

public class MergeSumAvg {

	public static void main(String[] args) {
		
		int sum=0;
		double avg;
		
		int a[]= {10,20,30,40};
	      
	      int b[]= {50,60,70};
	      
	      int size=a.length + b.length;
	       
	      int c[] = new int[size];

	       for(int i=0; i<a.length; i++) {
	    	   c[i]=a[i];
	       }
	       

	       for(int i=0; i<b.length; i++) {
	    	   c[i+a.length]=b[i];
	       } 
	       
	       for(int i=0; i<size; i++)
	       System.out.print(c[i]+" ");
		
	       for(int i=0; i<size; i++)
	    	   sum+=c[i];
	       
	       avg=sum/size;
	       
	       System.out.println();
	       System.out.println("sum="+sum);
	       System.out.println("avg="+avg);

	}

}
