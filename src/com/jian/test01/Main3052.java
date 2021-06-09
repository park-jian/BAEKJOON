package com.jian.test01;

import java.util.Scanner;

public class Main3052 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] num= new int[42];
		int check=0;
		for(int i=0; i<10; i++) {
			int su = sc.nextInt();
			num[su % 42]++;
		}
		sc.close();
		for(int i=0; i<42; i++) {
			if(num[i] != 0) {
				check++;
			}
			
		}
		System.out.println(check);

	}

}
