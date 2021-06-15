package com.jian.test01;

public class Main15596 {

	public static long sum(int[] a) {
		
		int total=0;
		for(int i=0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		int[] a= {3,23,54,65,26,76,34};
		
	    long total =sum(a);

	    System.out.println("total:" + total);
	}

}

