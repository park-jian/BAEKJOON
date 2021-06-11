package com.jian.test01;

import java.util.Scanner;

public class Main1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int copyN = N;
		int newNum = 0;
		int check=1;
		sc.close();
			
		while(true) {
			newNum = (N%10)*10 + ((N/10) + (N%10))%10;
			
			if(copyN == newNum) {
				break;
			}
			
			N = newNum;
			
			check++;
		}
		
		System.out.println(check);
		

	}

}
