package com.jian.test01;

import java.util.Scanner;

public class Main2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		String sum = String.valueOf(A * B * C);
		//17037300
		int[] arr = new int[10];
		//System.out.println(sum);
		for(int i=0; i<sum.length(); i++) {	
			arr[sum.charAt(i)-48]++;
		}
		for(int i=0; i<=9; i++) {
			System.out.println(arr[i]);
		}

	}

}
