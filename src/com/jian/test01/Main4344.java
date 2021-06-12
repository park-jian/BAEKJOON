package com.jian.test01;

import java.util.Scanner;

public class Main4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();     //3
		int N = 0;
		int[] arr ;
		float sum =0;
		int stud = 0;
		for(int i=0; i < C; i++) {        //0.1.2
			N = sc.nextInt();
			arr = new int[N];
			for(int j=0; j < N; j++) {
				arr[j]= sc.nextInt();
				sum += arr[j];
				
			}
			//평균
			System.out.print(sum/N);
			
			 for(int k=0; k < N; k++) {
				 if(arr[k] > (sum/N)) {
					 stud++;
				 }
			 
			 }
			 System.out.println(String.format("%.3f", (double)(stud/N)*100));
			 
			 
		}
		sc.close();

	}

}
